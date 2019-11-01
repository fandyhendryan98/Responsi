package com.example.responsi_093

object iphonee {
    private val iphoneeName = arrayOf(
        "Iphone Pertama",
        "Iphone Empat",
        "Iphone Lima C",
        "Iphone Lima",
        "Iphone SE",
        "Iphone Enam",
        "Iphone Tujuh",
        "Iphone Delapan",
        "Iphone X",
        "Iphone XR")

    private val detail= arrayOf(
        "Rp. 1.000.000,-",
        "Rp. 2.000.000,-",
        "Rp. 3.000.000,-",
        "Rp. 4.000.000,- ",
        "Rp. 5.000.000,-",
        "Rp. 6.000.000,- ",
        "Rp. 7.000.000,-",
        "Rp. 8.000.000,-",
        "Rp. 9.000.000,-",
        "Rp. 10.000.000,-")

    private val poster = intArrayOf(
        R.drawable.ip,
        R.drawable.empat,
        R.drawable.limac,
        R.drawable.lima,
        R.drawable.se,
        R.drawable.enam,
        R.drawable.tujuh,
        R.drawable.delapan,
        R.drawable.x,
        R.drawable.xr)

    val listIphoneAdapter: ArrayList<iphone>
        get() {
            var list: ArrayList<iphone> = arrayListOf<iphone>()
            for (position: Int in iphoneeName.indices) {
                val iphonee = iphone()
                iphonee.name = iphoneeName [position]
                iphonee.detail = detail[position]
                iphonee.poster = poster[position]
                list.add(iphonee)
            }
            return list
        }
}
