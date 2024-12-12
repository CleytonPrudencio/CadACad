package com.project.cadAcad.repositories;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class SchoolCategoryRepository implements JpaRepository<SchoolCategoryRepository, Long> {
    @Override
    public void flush() {

    }

    @Override
    public <S extends SchoolCategoryRepository> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends SchoolCategoryRepository> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<SchoolCategoryRepository> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public SchoolCategoryRepository getOne(Long aLong) {
        return null;
    }

    @Override
    public SchoolCategoryRepository getById(Long aLong) {
        return null;
    }

    @Override
    public SchoolCategoryRepository getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends SchoolCategoryRepository> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends SchoolCategoryRepository> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends SchoolCategoryRepository> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends SchoolCategoryRepository> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends SchoolCategoryRepository> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends SchoolCategoryRepository> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends SchoolCategoryRepository, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends SchoolCategoryRepository> S save(S entity) {
        return null;
    }

    @Override
    public <S extends SchoolCategoryRepository> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<SchoolCategoryRepository> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<SchoolCategoryRepository> findAll() {
        return null;
    }

    @Override
    public List<SchoolCategoryRepository> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(SchoolCategoryRepository entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends SchoolCategoryRepository> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<SchoolCategoryRepository> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<SchoolCategoryRepository> findAll(Pageable pageable) {
        return null;
    }
}
