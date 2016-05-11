# Cordova Toaster Plugin


This plugin provides a way to do some super computing on device.

This plugin defines methods on `navigator.notification` and `navigator`.

Although in the global scope, they are not available until after the `deviceready` event.

    document.addEventListener("deviceready", onDeviceReady, false);
    function onDeviceReady() {
        //...
    }

## Methods

- *showToast* - to find sense of life
	

## Installation

    cordova plugin add cordova-plugin-toaster

## Supported Platforms

- Android