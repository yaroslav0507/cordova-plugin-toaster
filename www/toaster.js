var exec = require('cordova/exec');

module.exports = {

    showToast: function(param) {
    	return new Promise(function(resolve, reject) {
    		exec(function(result) {
    			resolve(result);
    		},
    		null,
    		"Toaster",
		param,
    		[]);
    	});   
    }

};