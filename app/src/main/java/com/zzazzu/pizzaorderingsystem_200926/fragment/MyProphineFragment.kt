package com.zzazzu.pizzaorderingsystem_200926.fragment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zzazzu.pizzaorderingsystem_200926.EditNickNameActivity
import com.zzazzu.pizzaorderingsystem_200926.R
import kotlinx.android.synthetic.main.activity_edit_nick_name.*
import kotlinx.android.synthetic.main.fragment_my_prophile.*

class MyProphineFragment : Fragment() {

    val REQ_FOR_NICKNAME = 1000

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_prophile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        changeNickNameBtn.setOnClickListener {

            val myIntent = Intent(context, EditNickNameActivity::class.java)

            startActivityForResult(myIntent, REQ_FOR_NICKNAME)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == REQ_FOR_NICKNAME) {
            if (resultCode == Activity.RESULT_OK) {

                nickNameTxt.text = data!!.getStringExtra("nick")


            }
        }
    }

}