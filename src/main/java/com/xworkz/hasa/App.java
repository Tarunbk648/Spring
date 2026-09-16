package com.xworkz.hasa;


import com.xworkz.hasa.board.Board;
import com.xworkz.hasa.chalk.Chalk;
import com.xworkz.hasa.config.ConfigurationFile;
import com.xworkz.hasa.game.Game;
import com.xworkz.hasa.paper.NewsPaper;
import com.xworkz.hasa.space.SpaceDiscovery;
import com.xworkz.hasa.watch.Watch;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationFile.class);

        Board board=context.getBean(Board.class);
        System.out.println("Board Id:" +board.getBoardId());
        System.out.println("Chalk Color:" +board.getChalk().getColor());

        System.out.println();
        Game game= context.getBean(Game.class);
        System.out.println("Player info:" +game.getPlayer().getPlayerId());

        System.out.println();
        NewsPaper newsPaper= context.getBean(NewsPaper.class);
        System.out.println("NewsPaper info:" +newsPaper.getArticle().getArticleName());

        System.out.println();
        SpaceDiscovery spaceDiscovery= context.getBean(SpaceDiscovery.class);
        System.out.println("SpaceDiscovery info:" +spaceDiscovery.getFly().getFlyId());

        System.out.println();
        Watch watch= context.getBean(Watch.class);
        System.out.println("Watch info:" +watch.getBrand().getBrandId());

        
    }
}
