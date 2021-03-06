'use strict';

angular.module('app.ui').directive('smartProgressbar', function (lazyScript) {
    return {
        restrict: 'A',
        compile: function (tElement, tAttributes) {
        	lazyScript.register('bootstrap-progressbar').then(function(){
        		tElement.removeAttr('smart-progressbar data-smart-progressbar');
        		tElement.progressbar({
        		    display_text : 'fill'
        		})
        	})

        }
    }
});