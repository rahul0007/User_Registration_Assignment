package com.assignment.userregistration.lifecycle

import androidx.lifecycle.LiveData
import java.io.Serializable

data class LifecycleStateModelView(
    var liveDataCall: LiveData<*>,
    var liveDataError: LiveData<*>,
    var lifecycleState: LifecycleState
) : Serializable