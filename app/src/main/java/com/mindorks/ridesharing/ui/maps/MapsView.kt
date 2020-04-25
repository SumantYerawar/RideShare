package com.mindorks.ridesharing.ui.maps

import com.google.android.gms.maps.model.LatLng

interface MapsView  {

    fun showNearByCabs(latlngList: List<LatLng>)

//    fun informCabBooked()
//
//    fun showPath(latlngList: List<LatLng>)
//
//    fun updateCabLocation(latLng: LatLng)
//
//    fun informCabIsArriving()
//
//    fun informCabArrived()
//
//    fun informTripStart()
//
//    fun informTripEnd()
//
//    fun showRoutesNotAvailableError()
//
//    fun showDirectionApiFailedError(string: String)
}