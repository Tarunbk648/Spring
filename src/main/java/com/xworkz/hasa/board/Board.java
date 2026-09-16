package com.xworkz.hasa.board;


import com.xworkz.hasa.chalk.Chalk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Board {
    private int boardId;
    @Autowired
    private Chalk chalk;


    @Autowired
    public Board(@Value("1") int id){
        System.out.println("Board Parameterized constructor called");
        this.boardId=id;
        this.chalk=chalk;
    }

//    public Board(){
//        System.out.println("DEFAULT CONSTRUCTOR CALLED");
//    }

    public void write(){
        System.out.println("Board to write");
    }


    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setChalk(Chalk chalk) {
        this.chalk = chalk;
    }

    public Chalk getChalk() {
        return chalk;
    }
}
