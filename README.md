# Cordova Toaster Plugin

This plugin defines methods on `navigator.notification` and `navigator`.
<img align="right" src="https://www.dropbox.com/s/tfk8hrkbw086f5x/toaster_plugin_logo.jpg?dl=1" alt="Cordova Toaster Plugin" height="300px">


## Installation

    cordova plugin add cordova-plugin-toaster

This plugin provides a way to use native toasts of android devices.

Although in the global scope, they are not available until after the `deviceready` event.

    document.addEventListener("deviceready", onDeviceReady, false);
    function onDeviceReady() {
       // navigator.showToast('Your toast\'s text here');
    }

## Methods

- *showToast* - to show toast


## Supported Platforms

- Android

## Interface

![Interface](https://www.dropbox.com/s/sqg5f7s4dnnj5im/toaster_plugin_preview.jpg?dl=1)
