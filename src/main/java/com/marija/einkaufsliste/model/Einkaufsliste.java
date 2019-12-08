package com.marija.einkaufsliste.model;


import com.marija.einkaufsliste.model.fleisch.Fleisch;
import com.marija.einkaufsliste.model.gemuese.Gemuese;
import com.marija.einkaufsliste.model.milchprodukte.Milchprodukt;
import com.marija.einkaufsliste.model.obst.Obst;
import com.marija.einkaufsliste.model.snacksundsuesses.Snacksundsuesses;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Einkaufsliste {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> itemList;

//    private List<Gemuese> gemueseList;
//    private List<Milchprodukt> milchproduktList;
//    private List<Obst> obstList;
//    private List<Fleisch> fleischList;
//    private List<Snacksundsuesses> snacksundsuessesList;

//    public Einkaufsliste(){
//        gemueseList = new ArrayList<>();
//        milchproduktList = new ArrayList<>();
//        obstList = new ArrayList<>();
//        fleischList = new ArrayList<>();
//        snacksundsuessesList = new ArrayList<>();
//    }
//
//    @Override
//    public String toString() {
//        return "Einkaufsliste{" +
//                "gemueseList=" + gemueseList +
//                ", milchproduktList=" + milchproduktList +
//                ", obstList=" + obstList +
//                ", fleischList=" + fleischList +
//                ", snacksundsuessesList=" + snacksundsuessesList +
//                '}';
//    }
//
//    public void addItem(Essen essen){
//       if(essen instanceof Gemuese){
//        gemueseList.add((Gemuese) essen);
//       } else if(essen instanceof Milchprodukt){
//        milchproduktList.add((Milchprodukt) essen);
//       } else if(essen instanceof Obst){
//           obstList.add((Obst) essen);
//       } else if(essen instanceof Fleisch){
//           fleischList.add((Fleisch) essen);
//       } else if(essen instanceof Snacksundsuesses){
//           snacksundsuessesList.add((Snacksundsuesses) essen);
//       }
//    }
//
//    public void addItems(Essen... essenList){
//        for(Essen essen : essenList){
//            addItem(essen);
//        }
//    }

}
