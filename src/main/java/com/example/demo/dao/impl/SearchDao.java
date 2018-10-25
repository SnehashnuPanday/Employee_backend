package com.example.demo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.example.demo.dao.ISearchDao;
import com.example.demo.model.Employee;

public class SearchDao implements ISearchDao{

	@PersistenceContext
    EntityManager em;
	
	@Override
	public List<Employee> findAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
        Root<Employee> rootEntry = cq.from(Employee.class);
        CriteriaQuery<Employee> all = cq.select(rootEntry);
        //Join<Employee, MonthlyData> monthlyDataJoin = rootEntry.join(MonthlyData_.empId);
        TypedQuery<Employee> allQuery = em.createQuery(all);
        return allQuery.getResultList();
	}

}
