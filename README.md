# Cordova Toaster Plugin
[![npm version](https://badge.fury.io/js/cordova-plugin-toaster.svg)](https://badge.fury.io/js/cordova-plugin-toaster)

<img align="right" src="https://www.dropbox.com/s/tfk8hrkbw086f5x/toaster_plugin_logo.jpg?dl=1" alt="Cordova Toaster Plugin" height="300px">

This plugin provides a way to use native toasts of android devices.

This plugin defines methods on `navigator.notification` and `navigator`.

Although in the global scope, they are not available until after the `deviceready` event.

    document.addEventListener("deviceready", onDeviceReady, false);
    function onDeviceReady() {
       // navigator.showToast('Your toast\'s text here');
    }

## Methods

- *showToast* - to show toast
	

## Installation

    cordova plugin add cordova-plugin-toaster

## Supported Platforms

- Android
