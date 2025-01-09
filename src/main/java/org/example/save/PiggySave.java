package org.example.save;

public class PiggySave {
    // 기본은 0 -> 생성자 만들지 않아도됨
    // Private : 직접 접근 X, 입금,출금을 통해서만 접근가능, 위에는 특별한 이유없으면 붙이기
    //Getter: 읽기위해서 사용하는것,읽기만 허용 Setter: 쓰기위해서 사용, 읽고쓰기 허용

    private int total; //상태

    public void deposit(int amount){

        this.total+=amount;


    }

    public int withdraw(){
        //int로 선언 -> 무조건 int로 변수 하나 선언하고 리턴해야함
        int result = this.total;
        this.total=0;
        return result;


    }

}
