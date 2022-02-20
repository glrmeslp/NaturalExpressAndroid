package com.naturalexpress.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.naturalexpress.model.Banner
import com.naturalexpress.model.Category
import com.naturalexpress.model.Product

class HomeViewModel : ViewModel() {

    private val _banners = MutableLiveData<ArrayList<Banner>>().apply {
        value =  arrayListOf(
            Banner(1, "https://static-images.ifood.com.br/image/upload/t_high/discoveries/itensBasicosNOV21Principal_zE1X.png"),
            Banner(2, "https://static-images.ifood.com.br/image/upload/t_high/discoveries/Bebidas40offPrincipal_cljA.png"),
            Banner(3, "https://static-images.ifood.com.br/image/upload/t_high/discoveries/MerceariaeMatinaisPrincipal_mfDO.png"),
        )
    }

    private val _categories = MutableLiveData<ArrayList<Category>>().apply {
        value = arrayListOf(
            Category(1,"Legumes",arrayListOf(
                Product(1,"https://s3-alpha-sig.figma.com/img/9eb2/93d6/db3df6132aac245cc2fd0ab3a6bd5ee3?Expires=1646006400&Signature=TD2bAPslqfnIZ~lyDy1lhJ8NeAktvrULfJcdJcZVQcL~gFGgnVtDer~mjYtp~OsK-4a2VKnbotl40kqht-byzfJDTiauCwVFDnVXHH3TD8QcoCol4EyZUZTmm6VywqDapIFp6q7QPkE9HTVmhAIH2~U-fbYS4kNfOKoslf~SwtzJiBf7IeU1O1N9EpfzIPs4aB1tQZVocQGVxpb2hwqfABzEfZYwIzavjADM7gncFCLTFTBLSq57dB2ZKrdQOBL5whnVCZaZPUaR1TJ1lDqRtYmCX46hR9ljKGu4p0PNDxUZ7WXbrYJ7WVyix9PlLCgl1XkUxs-3Txs9qye4avz5Cg__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA","Batata",2.99),
                Product(2,"https://s3-alpha-sig.figma.com/img/9eb2/93d6/db3df6132aac245cc2fd0ab3a6bd5ee3?Expires=1646006400&Signature=TD2bAPslqfnIZ~lyDy1lhJ8NeAktvrULfJcdJcZVQcL~gFGgnVtDer~mjYtp~OsK-4a2VKnbotl40kqht-byzfJDTiauCwVFDnVXHH3TD8QcoCol4EyZUZTmm6VywqDapIFp6q7QPkE9HTVmhAIH2~U-fbYS4kNfOKoslf~SwtzJiBf7IeU1O1N9EpfzIPs4aB1tQZVocQGVxpb2hwqfABzEfZYwIzavjADM7gncFCLTFTBLSq57dB2ZKrdQOBL5whnVCZaZPUaR1TJ1lDqRtYmCX46hR9ljKGu4p0PNDxUZ7WXbrYJ7WVyix9PlLCgl1XkUxs-3Txs9qye4avz5Cg__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA","Batata",2.99),
                Product(3,"https://s3-alpha-sig.figma.com/img/9eb2/93d6/db3df6132aac245cc2fd0ab3a6bd5ee3?Expires=1646006400&Signature=TD2bAPslqfnIZ~lyDy1lhJ8NeAktvrULfJcdJcZVQcL~gFGgnVtDer~mjYtp~OsK-4a2VKnbotl40kqht-byzfJDTiauCwVFDnVXHH3TD8QcoCol4EyZUZTmm6VywqDapIFp6q7QPkE9HTVmhAIH2~U-fbYS4kNfOKoslf~SwtzJiBf7IeU1O1N9EpfzIPs4aB1tQZVocQGVxpb2hwqfABzEfZYwIzavjADM7gncFCLTFTBLSq57dB2ZKrdQOBL5whnVCZaZPUaR1TJ1lDqRtYmCX46hR9ljKGu4p0PNDxUZ7WXbrYJ7WVyix9PlLCgl1XkUxs-3Txs9qye4avz5Cg__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA","Batata",2.99),
                Product(4,"https://s3-alpha-sig.figma.com/img/9eb2/93d6/db3df6132aac245cc2fd0ab3a6bd5ee3?Expires=1646006400&Signature=TD2bAPslqfnIZ~lyDy1lhJ8NeAktvrULfJcdJcZVQcL~gFGgnVtDer~mjYtp~OsK-4a2VKnbotl40kqht-byzfJDTiauCwVFDnVXHH3TD8QcoCol4EyZUZTmm6VywqDapIFp6q7QPkE9HTVmhAIH2~U-fbYS4kNfOKoslf~SwtzJiBf7IeU1O1N9EpfzIPs4aB1tQZVocQGVxpb2hwqfABzEfZYwIzavjADM7gncFCLTFTBLSq57dB2ZKrdQOBL5whnVCZaZPUaR1TJ1lDqRtYmCX46hR9ljKGu4p0PNDxUZ7WXbrYJ7WVyix9PlLCgl1XkUxs-3Txs9qye4avz5Cg__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA","Batata",2.99),
            )),
            Category(2,"Hortaliças", arrayListOf(
                Product(5,"https://s3-alpha-sig.figma.com/img/9eb2/93d6/db3df6132aac245cc2fd0ab3a6bd5ee3?Expires=1646006400&Signature=TD2bAPslqfnIZ~lyDy1lhJ8NeAktvrULfJcdJcZVQcL~gFGgnVtDer~mjYtp~OsK-4a2VKnbotl40kqht-byzfJDTiauCwVFDnVXHH3TD8QcoCol4EyZUZTmm6VywqDapIFp6q7QPkE9HTVmhAIH2~U-fbYS4kNfOKoslf~SwtzJiBf7IeU1O1N9EpfzIPs4aB1tQZVocQGVxpb2hwqfABzEfZYwIzavjADM7gncFCLTFTBLSq57dB2ZKrdQOBL5whnVCZaZPUaR1TJ1lDqRtYmCX46hR9ljKGu4p0PNDxUZ7WXbrYJ7WVyix9PlLCgl1XkUxs-3Txs9qye4avz5Cg__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA","Batata",2.99),
                Product(6,"https://s3-alpha-sig.figma.com/img/9eb2/93d6/db3df6132aac245cc2fd0ab3a6bd5ee3?Expires=1646006400&Signature=TD2bAPslqfnIZ~lyDy1lhJ8NeAktvrULfJcdJcZVQcL~gFGgnVtDer~mjYtp~OsK-4a2VKnbotl40kqht-byzfJDTiauCwVFDnVXHH3TD8QcoCol4EyZUZTmm6VywqDapIFp6q7QPkE9HTVmhAIH2~U-fbYS4kNfOKoslf~SwtzJiBf7IeU1O1N9EpfzIPs4aB1tQZVocQGVxpb2hwqfABzEfZYwIzavjADM7gncFCLTFTBLSq57dB2ZKrdQOBL5whnVCZaZPUaR1TJ1lDqRtYmCX46hR9ljKGu4p0PNDxUZ7WXbrYJ7WVyix9PlLCgl1XkUxs-3Txs9qye4avz5Cg__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA","Batata",2.99),
                Product(7,"https://s3-alpha-sig.figma.com/img/9eb2/93d6/db3df6132aac245cc2fd0ab3a6bd5ee3?Expires=1646006400&Signature=TD2bAPslqfnIZ~lyDy1lhJ8NeAktvrULfJcdJcZVQcL~gFGgnVtDer~mjYtp~OsK-4a2VKnbotl40kqht-byzfJDTiauCwVFDnVXHH3TD8QcoCol4EyZUZTmm6VywqDapIFp6q7QPkE9HTVmhAIH2~U-fbYS4kNfOKoslf~SwtzJiBf7IeU1O1N9EpfzIPs4aB1tQZVocQGVxpb2hwqfABzEfZYwIzavjADM7gncFCLTFTBLSq57dB2ZKrdQOBL5whnVCZaZPUaR1TJ1lDqRtYmCX46hR9ljKGu4p0PNDxUZ7WXbrYJ7WVyix9PlLCgl1XkUxs-3Txs9qye4avz5Cg__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA","Batata",2.99),
                Product(8,"https://s3-alpha-sig.figma.com/img/9eb2/93d6/db3df6132aac245cc2fd0ab3a6bd5ee3?Expires=1646006400&Signature=TD2bAPslqfnIZ~lyDy1lhJ8NeAktvrULfJcdJcZVQcL~gFGgnVtDer~mjYtp~OsK-4a2VKnbotl40kqht-byzfJDTiauCwVFDnVXHH3TD8QcoCol4EyZUZTmm6VywqDapIFp6q7QPkE9HTVmhAIH2~U-fbYS4kNfOKoslf~SwtzJiBf7IeU1O1N9EpfzIPs4aB1tQZVocQGVxpb2hwqfABzEfZYwIzavjADM7gncFCLTFTBLSq57dB2ZKrdQOBL5whnVCZaZPUaR1TJ1lDqRtYmCX46hR9ljKGu4p0PNDxUZ7WXbrYJ7WVyix9PlLCgl1XkUxs-3Txs9qye4avz5Cg__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA","Batata",2.99),
            ))
       )
    }

    val banners: LiveData<ArrayList<Banner>> = _banners
    val categories: LiveData<ArrayList<Category>> = _categories

}