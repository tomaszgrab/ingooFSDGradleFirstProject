package com.example.ingooFSDGradleFirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBean5 {
    @Autowired
    public void setMyBean1(MyBean1 myBean1) {
        this.myBean1 = myBean1;
    }
    @Autowired
    public void setMyBean2(MyBean2 myBean2) {
        this.myBean2 = myBean2;
    }
    @Autowired
    public void setMyBean3(MyBean3 myBean3) {
        this.myBean3 = myBean3;
    }
    @Autowired
    public void setMyBean4(MyBean4 myBean4) {

        this.myBean4 = myBean4;
    }

    private MyBean1 myBean1;
    private MyBean2 myBean2;
    private MyBean3 myBean3;
    private MyBean4 myBean4;

   public void soutHello (){
      myBean1.soutHello();
      myBean2.soutHello();
      myBean3.soutHello();
      myBean4.soutHello();
   }
}
