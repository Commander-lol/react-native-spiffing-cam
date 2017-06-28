// @flow
import React, { Component } from 'react'
import { NativeModules, Platform, View, requireNativeComponent } from 'react-native'
import proptypes from 'prop-types'

const { LCSpiffingCam } = NativeModules;

const nativeDefinition = {
	nativeOnly: {},
}

const SpiffingCamView = requireNativeComponent('LCSpiffingCam', SpiffingCam, nativeDefinition)

class SpiffingCam extends Component {
	render() {
		return <SpiffingCamView {...this.props} />
	}
}

const module = Platform.OS === 'windows' ?
	(props) => <View {...props} />
	: SpiffingCam;

export default module