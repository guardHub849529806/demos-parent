package com.ecas.common.base.dao;

import com.ecas.common.base.model.BaseEntiy;

import java.util.List;

/**
 * @author devon
 * @version V1.0
 * @Description: TODO
 * @date 18-1-31 上午12:57
 */
public interface BaseDao <T extends BaseEntiy> {
    /**
     * 单条记录存储
     * @param t
     */
    void save(T t);

    /**
     * 批量存储
     * @param list
     */
    void saveBatch(List<T> list);

    /**
     * 根据ＩＤ删除
     * @param id
     */
    void removeById(Long id);

    /**
     * 根据集合删除
     * @param idList
     */
    void removeBatch(List<Long> idList);

    /**
     * 根据参数删除
     * @param t
     */
    void removeByParam(T t);

    /**
     *修改单条记录
     * @param t
     */
    void modify(T t);

    /**
     *批量修改记录
     * @param list
     */
    void modifyBatch(List<T> list);


    /**
     *根据Ｉｄ查询
     */
    T getById(Long id);

    /**
     *根据对象查询集合
     * @param t
     * @return
     */
    List<T> find(T t);

    /**
     *根据ＩＤ集合查询对象集合
     * @param ids
     * @return
     */
    List<T> getByIds(List<Long> ids);

    /**
     *分页查询
     * @param t
     * @param size
     * @param offset
     * @return
     */
    List<T> page(T t, Integer size, Integer offset);

    /**
     *根据参数
     * @param t
     * @return
     */
    Integer countParam(T t);
}