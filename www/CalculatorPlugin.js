
var CalculatorPlugin = {

	getAddResult:function (arg0,arg1, success, error) {
		cordova.exec(success, error, 'CalculatorPlugin', 'add', [arg0,arg1]);
	},

	getSubResult:function (arg0,arg1, success, error) {
		cordova.exec(success, error, 'CalculatorPlugin', 'sub', [arg0,arg1]);
	},

	getMulResult:function (arg0,arg1, success, error) {
		cordova.exec(success, error, 'CalculatorPlugin', 'mul', [arg0,arg1]);
	},

	getDivResult:function (arg0,arg1, success, error) {
		cordova.exec(success, error, 'CalculatorPlugin', 'div', [arg0,arg1]);
	}
}
module.exports = CalculatorPlugin;