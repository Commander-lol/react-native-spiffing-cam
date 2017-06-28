using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Com.Reactlibrary.LCSpiffingCam
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class LCSpiffingCamModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="LCSpiffingCamModule"/>.
        /// </summary>
        internal LCSpiffingCamModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "LCSpiffingCam";
            }
        }
    }
}
