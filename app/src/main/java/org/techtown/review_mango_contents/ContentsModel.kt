package org.techtown.review_mango_contents

/*2-5. 라사이클러뷰 만들 떄, 데이터를 모델로 전해주기 위해, 데이터모델을 만든다.*/
//url과 이미지 주소를 받는다.

data class ContentsModel(
    val url : String = "",
    val ImageUrl : String = "",
    val titleText : String = ""
)