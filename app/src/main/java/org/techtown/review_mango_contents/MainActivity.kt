package org.techtown.review_mango_contents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    /*2-8. 리사이클러뷰에 데이터를 넣겠다.*/
    private val items = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {

         super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*1. 먼저 스플래시 화면을 만들어준다. SplashActivity.java를 생성한다.*/

        /*2. 리사이클러뷰를 만든다. 먼저, 리사이클러뷰에 들어갈 아이템을 만든다. rv_item.xml 생성한다.*/

        /*2-8. 리사이클러뷰에 데이터를 넣겠다.*/
        items.add(
            ContentsModel(
                    "https://www.mangoplate.com/restaurants/iMRRP69qtkeO",
                "https://mp-seoul-image-production-s3.mangoplate.com/281547/753280_1550146766591_11966?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "미라이"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/47jYfj61kE",
                "https://mp-seoul-image-production-s3.mangoplate.com/953/24665_1459856728906_48110?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "애플하우스"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/10JjveRoc_N1",
                "https://mp-seoul-image-production-s3.mangoplate.com/1258384_1607355148529221.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "신흥정육식당"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/-csjvM0O5SlH",
                "https://mp-seoul-image-production-s3.mangoplate.com/428178/1727908_1610466129234_7890?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "돈까스전원"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/iMRRP69qtkeO",
                "https://mp-seoul-image-production-s3.mangoplate.com/281547/753280_1550146766591_11966?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "미라이"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/47jYfj61kE",
                "https://mp-seoul-image-production-s3.mangoplate.com/953/24665_1459856728906_48110?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "애플하우스"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/10JjveRoc_N1",
                "https://mp-seoul-image-production-s3.mangoplate.com/1258384_1607355148529221.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "신흥정육식당"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/-csjvM0O5SlH",
                "https://mp-seoul-image-production-s3.mangoplate.com/428178/1727908_1610466129234_7890?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "돈까스전원"
            )
        )

        /*2-9. 이제 리사이클러뷰를 연결한다.*/
        val recyclerview = findViewById<RecyclerView>(R.id.rv)

        val rvAdapter = RVAdapter(baseContext,items)
        recyclerview.adapter = rvAdapter

        recyclerview.layoutManager = GridLayoutManager(this,2)

    }
}