package com.project.cadAcad.repositories;

import com.project.cadAcad.entities.UserSituation;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class UserSituationRepository implements JpaRepository<UserSituation, Long> {
    @Override
    public void flush() {

    }

    @Override
    public <S extends UserSituation> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends UserSituation> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<UserSituation> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public UserSituation getOne(Long aLong) {
        return null;
    }

    @Override
    public UserSituation getById(Long aLong) {
        return null;
    }

    @Override
    public UserSituation getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends UserSituation> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends UserSituation> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends UserSituation> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends UserSituation> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends UserSituation> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends UserSituation> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends UserSituation, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends UserSituation> S save(S entity) {
        return null;
    }

    @Override
    public <S extends UserSituation> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<UserSituation> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<UserSituation> findAll() {
        return null;
    }

    @Override
    public List<UserSituation> findAllById(Iterable<Long> longs) {
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
    public void delete(UserSituation entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends UserSituation> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<UserSituation> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<UserSituation> findAll(Pageable pageable) {
        return null;
    }
}
