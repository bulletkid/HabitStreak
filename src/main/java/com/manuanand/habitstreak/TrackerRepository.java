package com.manuanand.habitstreak;

import org.springframework.data.repository.CrudRepository;

import com.manuanand.habitstreak.Tracker;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface TrackerRepository extends CrudRepository<Tracker, Integer> {

}
