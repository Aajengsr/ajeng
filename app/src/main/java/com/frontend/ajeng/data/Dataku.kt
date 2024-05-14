package com.frontend.ajeng.data

import com.frontend.ajeng.R
import com.frontend.ajeng.model.Place
import com.frontend.ajeng.model.Wisata
import com.frontend.ajeng.model.About
import com.frontend.ajeng.model.Penawaran

object Dataku {
    val dataPlacee = listOf(
        Place(
            id = 1,
            name = "Gresik",
            jarak = "25 mnt (30 km)",
            photo = R.drawable.gresik
        ),
        Place(
            id = 2,
            name = "Lamongan",
            jarak = "35 mnt (45 km)",
            photo = R.drawable.lamongan
        ),
        Place(
            id = 3,
            name = "Mojokerto",
            jarak = "1 jam 11 mnt (93 km)",
            photo = R.drawable.mojokerto
        ),
        Place(
            id = 4,
            name = "Bojonegoro",
            jarak = "1 jam 28 mnt (113 km)",
            photo = R.drawable.bojonegoro
        ),
        Place(
            id = 5,
            name = "Surabaya",
            jarak = "1 jam 15 mnt (95 km)",
            photo = R.drawable.surabaya
        ),
        Place(
            id = 6,
            name = "Malang",
            jarak = "3 jam 54 mnt (264 km)",
            photo = R.drawable.malang
        ),
        Place(
            id = 7,
            name = "Probolinggo",
            jarak = "3 jam 23 mnt (231 km)",
            photo = R.drawable.probolinggo
        ),
        Place(
            id = 8,
            name = "Blitar",
            jarak = "2 jam 32 mnt (170 km)",
            photo = R.drawable.blitar
        ),
        Place(
            id = 9,
            name = "Jombang",
            jarak = "1 jam 27 mnt (103 km)",
            photo = R.drawable.jombang
        ),
        Place(
            id = 10,
            name = "Bangkalan",
            jarak = "1 jam 53 mnt (117 km)",
            photo = R.drawable.bangkalan
        )
    )

    val dataWisataa = listOf(
        Wisata(
            id = 1,
            name = "Bukit Jamur",
            jarak = "2 km",
            adress = "Jl Raya Bungah No.01",
            photo = R.drawable.bukitjamur
        ),
        Wisata(
            id = 2,
            name = "Pantai Pasir Putih Dalegan",
            jarak = "10 km",
            adress = "Jl Daendels Dalegan No.03",
            photo = R.drawable.pasirputihdalegan
        ),
        Wisata(
            id = 3,
            name = "Mangrove Banyuurip",
            jarak = "8 km",
            adress = "Jl Banyuurip, Kec. Ujungpangkah",
            photo = R.drawable.mangrove
        ),
        Wisata(
            id = 4,
            name = "Alun Alun Gresik",
            jarak = "20 km",
            adress = "Jl KH Wachid Hasyim No.20, Kab. Gresik",
            photo = R.drawable.alunalungsk
        ),
        Wisata(
            id = 5,
            name = "Makam Sunan Giri",
            jarak = "23 km",
            adress = "Jl Sunan Giri, Kab. Gresik",
            photo = R.drawable.sunangiri
        ),
        Wisata(
            id = 6,
            name = "Wisata Alam Setigi",
            jarak = "7 km",
            adress = "Area Sawah/Kebun, Sekapuk Ujungpangkah",
            photo = R.drawable.setigi
        ),
        Wisata(
            id = 7,
            name = "Wisata Lontar Sewu",
            jarak = "30 km",
            adress = "Hedrosari, Kec. Menganti",
            photo = R.drawable.lontarsewu
        ),
        Wisata(
            id = 8,
            name = "Telaga Ngipik",
            jarak = "16 km",
            adress = "Jarangkuwung Ngipik, Kec. Gresik",
            photo = R.drawable.telagangipik
        ),
        Wisata(
            id = 9,
            name = "Dynasty Waterpark",
            jarak = "18 km",
            adress = "Jl Rantau Wonorejo, Yosowilangun, Kec. Manayar",
            photo = R.drawable.dynasty
        ),
        Wisata(
            id = 10,
            name = "Wisata Bajak Laut",
            jarak = "4 km",
            adress = "Area Sawah/Kebun, Masangan, Kec. Bungah",
            photo = R.drawable.bajaklaut
        )
    )

    val dataAboutt = listOf(
        About(
            name = "Ajeng Sri Indawati",
            nim = "2112110023",
            email = "aajengsr2104@gmail.com",
            asalPT = "Universitas Qomaruddin Gresik",
            prodi = "Teknik Informatika",
            photo = R.drawable.ajengsri
        )
    )

    val dataPenawarann = listOf(
        Penawaran(
            id = 1,
            name = "Air Terjun",
            tipe = "standart",
            photo = R.drawable.airterjun
        ),
        Penawaran(
            id = 2,
            name = "Kolam Renang",
            tipe = "high",
            photo = R.drawable.kolamrenang
        ),
        Penawaran(
            id = 3,
            name = "Wisata Alam",
            tipe = "flow",
            photo = R.drawable.wisataalam
        ),
        Penawaran(
            id = 4,
            name = "Outbond $ Perkemahan",
            tipe = "standart",
            photo = R.drawable.outbond
        ),
        Penawaran(
            id = 5,
            name = "Pantai aesthetic",
            tipe = "high",
            photo = R.drawable.pantai
        ),
        Penawaran(
            id = 6,
            name = "Wahana Hiburan",
            tipe = "flow",
            photo = R.drawable.wahanahiburan
        ),
        Penawaran(
            id = 7,
            name = "Tempat Ziarah Waliyullah",
            tipe = "standart",
            photo = R.drawable.makamwaliyullah
        ),
        Penawaran(
            id = 8,
            name = "Tempat Nongkrong Santai",
            tipe = "high",
            photo = R.drawable.nongkrong
        ),
        Penawaran(
            id = 9,
            name = "Penginapan View Alam",
            tipe = "flow",
            photo = R.drawable.penginapan
        ),
        Penawaran(
            id = 10,
            name = "Wisata Candi Borobudor",
            tipe = "flow",
            photo = R.drawable.candiborobudor
        )
    )
}