package lv.venta.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import lv.venta.model.Grade;

public interface IGradeRepo extends CrudRepository<Grade, Integer>{

	//pēc noklusejuma public abstract
	//izpildīs so vaicājumu: select * from grade_table where grvalue< <argumentā padoto>;
	ArrayList<Grade> findByGrvalueLessThan(int i);

}
