var exec = require('cordova/exec');

exports.getAddResult = function (arg0,arg1, success, error) {
    exec(success, error, 'CalculatorPlugin', 'add', [arg0,arg1]);
};

exports.getSubResult = function (arg0,arg1, success, error) {
    exec(success, error, 'CalculatorPlugin', 'sub', [arg0,arg1]);
};

exports.getMulResult = function (arg0,arg1, success, error) {
    exec(success, error, 'CalculatorPlugin', 'mul', [arg0,arg1]);
};

exports.getDivResult = function (arg0,arg1, success, error) {
    exec(success, error, 'CalculatorPlugin', 'div', [arg0,arg1]);
};