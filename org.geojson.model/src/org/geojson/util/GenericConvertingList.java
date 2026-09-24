/**
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.geojson.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.AbstractEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * A list view that converts between the values of a backing list and another representation.
 * It implements {@link InternalEList}, because EMF uses the {@code basic*} and {@code *Unique}
 * methods of many-valued features, e.g. when loading XMI. The elements are computed on every
 * access, so the {@code basic*} methods behave like their regular counterparts.
 * 
 * @author Juergen Albert
 * @since 29 Nov 2024
 */
public class GenericConvertingList<T,E> extends AbstractEList<T> implements InternalEList<T>, EStructuralFeature.Setting{

	
	private EList<E> backingList;
	private Function<T, E> tToE;
	private Function<E, T> eToT;
	
	/**
	 * Creates a new instance.
	 */
	public GenericConvertingList(EList<E> backingList, Function<T, E> tToE, Function<E, T> eToT) {
		this.backingList = backingList;
		this.tToE = tToE;
		this.eToT = eToT;
	}
	
	
	/* 
	 * (non-Javadoc)
	 * @see java.util.List#size()
	 */
	@Override
	public int size() {
		return backingList.size();
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.AbstractEList#primitiveGet(int)
	 */
	@Override
	protected T primitiveGet(int index) {
		return eToT.apply(backingList.get(index));
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.AbstractEList#setUnique(int, java.lang.Object)
	 */
	@Override
	public T setUnique(int index, T object) {
		E set = backingList.set(index, tToE.apply(object));
		return set == null ? null : eToT.apply(set);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.AbstractEList#addUnique(java.lang.Object)
	 */
	@Override
	public void addUnique(T object) {
		backingList.add(tToE.apply(object));
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.AbstractEList#addUnique(int, java.lang.Object)
	 */
	@Override
	public void addUnique(int index, T object) {
		backingList.add(index, tToE.apply(object));
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.AbstractEList#addAllUnique(java.util.Collection)
	 */
	@Override
	public boolean addAllUnique(Collection<? extends T> collection) {
		Collection<E> convert =  collection.stream().map(tToE).collect(Collectors.toList());
		return backingList.addAll(convert);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.AbstractEList#addAllUnique(int, java.util.Collection)
	 */
	@Override
	public boolean addAllUnique(int index, Collection<? extends T> collection) {
		Collection<E> convert =  collection.stream().map(tToE).collect(Collectors.toList());
		return backingList.addAll(index, convert);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.AbstractEList#addAllUnique(java.lang.Object[], int, int)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean addAllUnique(Object[] objects, int start, int end) {
		for (int i = start; i < end; i++) {
			backingList.add(tToE.apply((T) objects[i]));
		}
		return start < end;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.AbstractEList#addAllUnique(int, java.lang.Object[], int, int)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean addAllUnique(int index, Object[] objects, int start, int end) {
		for (int i = start; i < end; i++) {
			backingList.add(index++, tToE.apply((T) objects[i]));
		}
		return start < end;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.AbstractEList#remove(int)
	 */
	@Override
	public T remove(int index) {
		E removed = backingList.remove(index);
		return removed == null ? null : eToT.apply(removed);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.AbstractEList#move(int, int)
	 */
	@Override
	public T move(int targetIndex, int sourceIndex) {
		E moved = backingList.move(targetIndex, sourceIndex);
		return moved == null ? null : eToT.apply(moved);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.AbstractEList#basicList()
	 */
	@Override
	public List<T> basicList() {
		return backingList.stream().map(eToT).collect(Collectors.toList());
	}

	/* 
	 * (non-Javadoc)
	 * @see java.util.AbstractList#get(int)
	 */
	@Override
	public T get(int index) {
		E get = backingList.get(index);
		return get == null ? null : eToT.apply(get);
	}


	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.AbstractEList#basicGet(int)
	 */
	@Override
	public T basicGet(int index) {
		return get(index);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.AbstractEList#basicIterator()
	 */
	@Override
	public Iterator<T> basicIterator() {
		return iterator();
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.AbstractEList#basicListIterator()
	 */
	@Override
	public ListIterator<T> basicListIterator() {
		return listIterator();
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.AbstractEList#basicListIterator(int)
	 */
	@Override
	public ListIterator<T> basicListIterator(int index) {
		return listIterator(index);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.InternalEList#basicToArray()
	 */
	@Override
	public Object[] basicToArray() {
		return toArray();
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.InternalEList#basicToArray(java.lang.Object[])
	 */
	@Override
	public <A> A[] basicToArray(A[] array) {
		return toArray(array);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.InternalEList#basicIndexOf(java.lang.Object)
	 */
	@Override
	public int basicIndexOf(Object object) {
		return indexOf(object);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.InternalEList#basicLastIndexOf(java.lang.Object)
	 */
	@Override
	public int basicLastIndexOf(Object object) {
		return lastIndexOf(object);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.InternalEList#basicContains(java.lang.Object)
	 */
	@Override
	public boolean basicContains(Object object) {
		return contains(object);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.InternalEList#basicContainsAll(java.util.Collection)
	 */
	@Override
	public boolean basicContainsAll(Collection<?> collection) {
		return containsAll(collection);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.InternalEList#basicRemove(java.lang.Object, org.eclipse.emf.common.notify.NotificationChain)
	 */
	@Override
	public NotificationChain basicRemove(Object object, NotificationChain notifications) {
		remove(object);
		return notifications;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.InternalEList#basicAdd(java.lang.Object, org.eclipse.emf.common.notify.NotificationChain)
	 */
	@Override
	public NotificationChain basicAdd(T object, NotificationChain notifications) {
		addUnique(object);
		return notifications;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.EStructuralFeature.Setting#getEObject()
	 */
	@Override
	public EObject getEObject() {
		return ((Setting) backingList).getEObject();
	}


	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.EStructuralFeature.Setting#getEStructuralFeature()
	 */
	@Override
	public EStructuralFeature getEStructuralFeature() {
		// TODO Auto-generated method stub
		return null;
	}


	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.EStructuralFeature.Setting#get(boolean)
	 */
	@Override
	public Object get(boolean resolve) {
		return this;
	}


	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.EStructuralFeature.Setting#set(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
  @Override
	public void set(Object newValue) {
		GenericConvertingList<T, E> src = (GenericConvertingList<T, E>) newValue;
		backingList = src.backingList;
		eToT = src.eToT;
		tToE = src.tToE;
	}


	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.EStructuralFeature.Setting#isSet()
	 */
	@Override
	public boolean isSet() {
		return ((Setting) backingList).isSet();
	}


	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.EStructuralFeature.Setting#unset()
	 */
	@Override
	public void unset() {
		((Setting) backingList).unset();
	}

}
