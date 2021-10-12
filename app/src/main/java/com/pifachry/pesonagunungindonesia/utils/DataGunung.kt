package com.pifachry.pesonagunungindonesia.utils

import com.pifachry.pesonagunungindonesia.R

object DataGunung {

    private val namaGunung = arrayOf(
        "Gunung Rinjani",
        "Gunung Semeru",
        "Gunung Prau",
        "Gunung Merbabu",
        "Gunung Gede Pangrango",
        "Gunung Papandayan",
        "Gunung Bromo",
        "Gunung Ijen",
        "Gunung Kelimutu",
        "Gunung Patuha",
        "Gunung Kerinci",
        "Gunung Sindoro",
        "Gunung Sumbing",
        "Gunung Lawu",
        "Gunung Ceremai",
        "Gunung Slamet",
        "Gunung Kelud"
    )

    private val lokasiGunung = arrayOf(
        "Lombok, NTB",
        "Malang, Jawa Timur",
        "Dieng, Jawa Tengah",
        "Magelang, Jawa Tengah",
        "Jawa Barat",
        "Garut, Jawa Barat",
        "Malang, Jawa Timur",
        "Banyuwangi, Jawa Timur",
        "Pulau Flores, NTT",
        "Ciwidey, Jawa Barat",
        "Jambi, Sumatera Barat",
        "Jawa Tengah",
        "Jawa Tengah",
        "Jawa Tengah",
        "Kuningan, Jawa Barat",
        "Jawa Tengah",
        "Kediri, Jawa Timur"
    )

    private val fotoGunung = intArrayOf(
        R.drawable.rinjani,
        R.drawable.semeru,
        R.drawable.prau,
        R.drawable.merbabu,
        R.drawable.gede,
        R.drawable.papandayan,
        R.drawable.bromo,
        R.drawable.ijen,
        R.drawable.kelimutu,
        R.drawable.patuha,
        R.drawable.kerinci,
        R.drawable.sindoro,
        R.drawable.sumbing,
        R.drawable.lawu,
        R.drawable.ceremai,
        R.drawable.slamet,
        R.drawable.kelud
    )

    val ketingganGunung = mapOf(
        "Gunung Rinjani" to "3726 mdpl",
        "Gunung Semeru" to "3676 mdpl",
        "Gunung Prau" to "2565 mdpl",
        "Gunung Merbabu" to "3145 mdpl",
        "Gunung Gede Pangrango" to "2958 mdpl",
        "Gunung Papandayan" to "2665 mdpl",
        "Gunung Bromo" to "2329 mdpl",
        "Gunung Ijen" to "2779 mdpl",
        "Gunung Kelimutu" to "1639 mdpl",
        "Gunung Patuha" to "2434 mdpl",
        "Gunung Kerinci" to "3805 mdpl",
        "Gunung Sindoro" to "3153 mdpl",
        "Gunung Sumbing" to "3371 mdpl",
        "Gunung Lawu" to "3265 mdpl",
        "Gunung Ceremai" to "3078 mdpl",
        "Gunung Slamet" to "3428 mdpl",
        "Gunung Kelud" to "1731 mdpl"
    )

    val descGunung = mapOf(
        "Gunung Rinjani" to "Gunung Rinjani adalah gunung yang komplit. Ia punya padang sabana cantik yang ditumbuhi bunda edelweis, ia juga punya pemandangan sunrise yang menawan. Dari semua keindahan yang ada di Gunung Rinjani, Danau Segara Anak adalah yang paling dicari. Danau yang berada di ketinggian 2.000 mdpl ini merupakan permata paling indah di Gunung Rinjani.",
        "Gunung Semeru" to "Gunung ini telah menjadi legenda sejak lama. Mulai dari jaman Su Hok Gie hingga jamannya pendaki kekinian seperti sekarang. Keindahan gunung ini tak pernah lekang termakan waktu. Keindahan gunung ini membuat para pendaki dari berbagai daerah rela datang jauh-jauh.",
        "Gunung Prau" to "Gunung ini merupakan tanah tertinggi dalam barisan Dataran Tinggi Dieng. Dari puncak gunung ini kita bisa melihat pemandangan puncak Gunung Sindoro dan Sumbing yang terlihat begitu gagah dan elegan.",
        "Gunung Merbabu" to "Gunung ini berada di antara perbatasan Kabupaten Magelang, Boyolali serta Semarang. Gunung Merbabu menyajikan keindahan berupa padang sabana yang bisa kita nikmati dari lereng-lereng puncak serta puncak.",
        "Gunung Gede Pangrango" to "Tempat yang paling indah di Gunung Gede adalah Alun-alun Suryakencana. Tempat ini merupakan padang rumput yang dipenuhi bunga edelweis. Alun-alun Suryakencana merupakan salah satu tempat terbaik untuk menikmati pemandangan sang bunda abadi, Edelweis.",
        "Gunung Papandayan" to "Tempat yang paling indah di Gunung Gede adalah Alun-alun Suryakencana. Tempat ini merupakan padang rumput yang dipenuhi bunga edelweis. Alun-alun Suryakencana merupakan salah satu tempat terbaik untuk menikmati pemandangan sang bunda abadi, Edelweis.",
        "Gunung Bromo" to "Gunung Bromo memiliki pemandangan yang layak untuk dipromosikan secara luas. Gunung Bromo juga dikenal dengan gumul pasirnya yang sangat luas. Kendaraan jeep serta kuda menjadi pemandangan yang biasa di Gunung Bromo. ",
        "Gunung Ijen" to "Gunung Ijen sangat terkenal dengan pemandangan api birunya. Sebuah fenomena alam langka yang konon hanya ada dua di dunia. Api biru tersebut berasal dari cairan belerang yang ditambang secara tradisional oleh masyarakat di sekitar Gunung Ijen.",
        "Gunung Kelimutu" to "Di puncak gunung ini terdapat tiga buah danau yang dikenal dengan Danau Tiga Warna karna masing-masing air di danau tersebut memiliki warna yang berbeda-beda. Ketiga danau tersebut memiliki nama masing-masing antara lain Tiwu Nuwa Muri Koo Fai (danau biru), Tiwu Ata Polo (danau merah) dan Tiwu Ata Mbupu (danau putih).",
        "Gunung Patuha" to "Nama gunung ini mungkin masih cukup asing. Namun, jika disebutkan Kawah Putih, semua pasti sudah tahu dimana gunung ini berada. Kawah Putih merupakan bagian dari Gunung Patuha yang lebih dikenal orang daripada Gunung Patuha itu sendiri.",
        "Gunung Kerinci" to "Gunung kerinci adalah gunung tertinggi di Sumatera dan merupakan gunung berapi yang paling tinggi di Indonesia. Gunung Kerinci berlokasi di Provinsi Jambi yang berbatasan dengan Sumatera Barat dan masuk dalam wilayah Taman Nasional Kerinci Seblat. Berada dalam wilayah Taman Nasional, gunung terindah di indonesia ini juga merupakan habitat harimau dan badak sumatera yang dilindungi oleh pemerintah.",
        "Gunung Sindoro" to "Gunung Sindoro berlokasi di wilayah antara Kabupaten Temanggung dan Kabupaten Wonosobo, Jawa tengah. Salah satu keunikan yang paling mencolok dari gunung ini adalah puncaknya. Puncak Gunung Sindoro berbeda dari puncak-puncak gunung tinggi di Pulau Jawa lainnya, yaitu memiliki puncak yang sangat luas. Tempat ini menjadi salah satu camping ground favorite para pendaki yang datang.",
        "Gunung Sumbing" to "Gunung Sumbing yang berada di sebelah Gunung Sindoro ini juga memiliki pesona yang sangat indah. Gunung ini secara administratif terletak di tiga wilayah kabupaten, yaitu Kabupaten Magelang Kabupaten Temanggung dan Kabupaten Wonosobo. Gunung ini mendapat julukan \"Tripel S\" oleh pendaki, yaitu Sumbing, Sindoro dan Slamet. Gunung sumbing merupakan gunung tertinggi kedua di Jawa Tengah setelah Gunung Slamet.",
        "Gunung Lawu" to "Gunung Lawu masih tergolong ramah untuk pendaki pemula. Gunung ini terletak di perbatasan antara Jawa Tengah dan Jawa Timur. Gunung ini juga menjadi salah satu tempat wisata ziarah terutama pada bulan Suro. jalur yang terkenal ada dua, yaitu lewat Cemoro Kandang di Tawangmangu, Karanganyar, Jawa Tengah atau Cemoro Sewu di Sarangan, Jawa Timur.",
        "Gunung Ceremai" to "Gunung Ceremai, sering kali penyebutan nama gunung ini salah kaprah dengan dinamakan “Ciremai” adalah gunung berapi kerucut yang secara administratif termasuk dalam wilayah dua kabupaten, yakni Kabupaten Kuningan dan Kabupaten Majalengka. Gunung ini juga memiliki keunikan karena memiliki dua kawah. Kawah barat yang beradius 400 m terpotong oleh kawah timur yang beradius 600 m. Di bagian gunung didominasi hutan pinus sedangkan di bagian atas didominasi hutan alami.",
        "Gunung Slamet" to "Gunung Slamet adalah sebuah gunung berapi kerucut yang terdapat di Provinsi Jawa Tengah. Gunung Slamet merupakan gunung tertinggi di Jawa Tengah serta kedua tertinggi di Pulau Jawa setelah Gunung Semeru. Gunung Slamet cukup populer sebagai sasaran pendakian meskipun medannya dikenal sulit. Di kaki gunung ini terletak kawasan wisata Baturraden yang menjadi andalan kabupaten Banyumas karena hanya berjarak sekitar 15km dari Purwokerto.",
        "Gunung Kelud" to "Gunung Kelud berada diperbatasan Kota Malang, Kediri, dan Blitar. Di Gunung ini terdapat danau dengan kawah hijau toska yang terlihat begitu menawan. Ada juga wisata air panas yang turut menambah daya tarik Gunung Kelud. Sajian pemandangan yang indah serta akses jalan yang terbilang bagus akan membuat yang melihat merasa kagum."
    )

    val mountainStatus = mapOf(
        "aktif" to arrayOf(
            "Gunung Rinjani",
            "Gunung Semeru",
            "Gunung Gede Pangrango",
            "Gunung Papandayan",
            "Gunung Bromo",
            "Gunung Ijen",
            "Gunung Kelimutu",
            "Gunung Patuha",
            "Gunung Kerinci",
            "Gunung Sindoro",
            "Gunung Sumbing",
            "Gunung Lawu",
            "Gunung Ceremai",
            "Gunung Slamet",
            "Gunung Kelud"
        ),
        "tidak aktif" to arrayOf(
            "Gunung Prau",
            "Gunung Merbabu"
        )
    )

    val listData: ArrayList<Gunung>
        get(){
            val listGunung = arrayListOf<Gunung>()
            for (position in namaGunung.indices){
                val gunung = Gunung()
                gunung.name = namaGunung[position]
                gunung.location = lokasiGunung[position]
                gunung.photo = fotoGunung[position]
                listGunung.add(gunung)
            }
            return listGunung
        }
}