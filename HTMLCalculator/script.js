// Beautiful Calculator JavaScript
class Calculator {
    constructor() {
        this.currentInput = '0';
        this.previousInput = null;
        this.operator = null;
        this.waitingForOperand = false;
        this.history = [];
    }

    updateDisplay() {
        const display = document.getElementById('display');
        const history = document.getElementById('history');
        
        display.textContent = this.formatNumber(this.currentInput);
        
        if (this.history.length > 0) {
            history.textContent = this.history[this.history.length - 1];
        } else {
            history.textContent = '';
        }
    }

    formatNumber(num) {
        if (num.toString().length > 12) {
            return parseFloat(num).toExponential(6);
        }
        return num.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ',');
    }

    inputNumber(num) {
        if (this.waitingForOperand) {
            this.currentInput = num;
            this.waitingForOperand = false;
        } else {
            this.currentInput = this.currentInput === '0' ? num : this.currentInput + num;
        }
        this.updateDisplay();
    }

    inputOperator(nextOperator) {
        const inputValue = parseFloat(this.currentInput.replace(/,/g, ''));

        if (this.previousInput === null) {
            this.previousInput = inputValue;
        } else if (this.operator) {
            const currentValue = this.previousInput || 0;
            const newValue = this.calculate(currentValue, inputValue, this.operator);

            this.currentInput = String(newValue);
            this.previousInput = newValue;
            this.updateDisplay();
        }

        this.waitingForOperand = true;
        this.operator = nextOperator;
    }

    calculate(firstOperand, secondOperand, operator) {
        let result;
        
        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand === 0) {
                    throw new Error('Cannot divide by zero');
                }
                result = firstOperand / secondOperand;
                break;
            default:
                return secondOperand;
        }

        // Round to avoid floating point precision issues
        return Math.round((result + Number.EPSILON) * 100000000) / 100000000;
    }

    performCalculation() {
        const inputValue = parseFloat(this.currentInput.replace(/,/g, ''));

        if (this.previousInput !== null && this.operator) {
            try {
                const calculation = `${this.previousInput} ${this.operator} ${inputValue} = `;
                const result = this.calculate(this.previousInput, inputValue, this.operator);
                
                this.history.push(calculation + result);
                if (this.history.length > 5) {
                    this.history.shift(); // Keep only last 5 calculations
                }
                
                this.currentInput = String(result);
                this.previousInput = null;
                this.operator = null;
                this.waitingForOperand = true;
                
                this.updateDisplay();
            } catch (error) {
                this.currentInput = 'Error';
                this.previousInput = null;
                this.operator = null;
                this.waitingForOperand = true;
                this.updateDisplay();
            }
        }
    }

    clear() {
        this.currentInput = '0';
        this.previousInput = null;
        this.operator = null;
        this.waitingForOperand = false;
        this.updateDisplay();
    }

    clearEntry() {
        this.currentInput = '0';
        this.updateDisplay();
    }

    deleteLast() {
        if (this.currentInput.length > 1) {
            this.currentInput = this.currentInput.slice(0, -1);
        } else {
            this.currentInput = '0';
        }
        this.updateDisplay();
    }

    inputDecimal() {
        if (this.waitingForOperand) {
            this.currentInput = '0.';
            this.waitingForOperand = false;
        } else if (this.currentInput.indexOf('.') === -1) {
            this.currentInput += '.';
        }
        this.updateDisplay();
    }
}

// Initialize calculator
const calc = new Calculator();
calc.updateDisplay();

// Button event handlers
function appendToDisplay(value) {
    if (['+', '-', '*', '/'].includes(value)) {
        calc.inputOperator(value);
    } else if (value === '.') {
        calc.inputDecimal();
    } else {
        calc.inputNumber(value);
    }
}

function calculate() {
    calc.performCalculation();
}

function clearAll() {
    calc.clear();
}

function clearEntry() {
    calc.clearEntry();
}

function deleteLast() {
    calc.deleteLast();
}

// Keyboard support
document.addEventListener('keydown', function(event) {
    const key = event.key;
    
    // Prevent default behavior for calculator keys
    if (/[0-9+\-*/.=]/.test(key) || key === 'Enter' || key === 'Escape' || key === 'Backspace') {
        event.preventDefault();
    }
    
    if (/[0-9]/.test(key)) {
        appendToDisplay(key);
    } else if (['+', '-', '*', '/'].includes(key)) {
        appendToDisplay(key);
    } else if (key === '.') {
        appendToDisplay('.');
    } else if (key === 'Enter' || key === '=') {
        calculate();
    } else if (key === 'Escape') {
        clearAll();
    } else if (key === 'Backspace') {
        deleteLast();
    }
});

// Add visual feedback for keyboard presses
document.addEventListener('keydown', function(event) {
    const keyMap = {
        '0': () => document.querySelector('button[onclick="appendToDisplay(\'0\')"]'),
        '1': () => document.querySelector('button[onclick="appendToDisplay(\'1\')"]'),
        '2': () => document.querySelector('button[onclick="appendToDisplay(\'2\')"]'),
        '3': () => document.querySelector('button[onclick="appendToDisplay(\'3\')"]'),
        '4': () => document.querySelector('button[onclick="appendToDisplay(\'4\')"]'),
        '5': () => document.querySelector('button[onclick="appendToDisplay(\'5\')"]'),
        '6': () => document.querySelector('button[onclick="appendToDisplay(\'6\')"]'),
        '7': () => document.querySelector('button[onclick="appendToDisplay(\'7\')"]'),
        '8': () => document.querySelector('button[onclick="appendToDisplay(\'8\')"]'),
        '9': () => document.querySelector('button[onclick="appendToDisplay(\'9\')"]'),
        '+': () => document.querySelector('button[onclick="appendToDisplay(\'+\')"]'),
        '-': () => document.querySelector('button[onclick="appendToDisplay(\'-\')"]'),
        '*': () => document.querySelector('button[onclick="appendToDisplay(\'*\')"]'),
        '/': () => document.querySelector('button[onclick="appendToDisplay(\'/\')"]'),
        '.': () => document.querySelector('button[onclick="appendToDisplay(\'.\')"]'),
        'Enter': () => document.querySelector('button[onclick="calculate()"]'),
        '=': () => document.querySelector('button[onclick="calculate()"]'),
        'Escape': () => document.querySelector('button[onclick="clearAll()"]'),
        'Backspace': () => document.querySelector('button[onclick="deleteLast()"]')
    };
    
    const button = keyMap[event.key] && keyMap[event.key]();
    if (button) {
        button.style.transform = 'scale(0.95)';
        button.style.filter = 'brightness(1.1)';
        setTimeout(() => {
            button.style.transform = '';
            button.style.filter = '';
        }, 100);
    }
});

// Add smooth animations on load
document.addEventListener('DOMContentLoaded', function() {
    const buttons = document.querySelectorAll('.btn');
    buttons.forEach((button, index) => {
        button.style.opacity = '0';
        button.style.transform = 'translateY(20px)';
        
        setTimeout(() => {
            button.style.transition = 'all 0.5s ease';
            button.style.opacity = '1';
            button.style.transform = 'translateY(0)';
        }, index * 50);
    });
});