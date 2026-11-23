/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim.impl;

import org.dmtf.cim.CIM_BufferPool;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Buffer Pool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BufferPoolImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BufferPoolImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BufferPoolImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BufferPoolImpl#getSizeOfBuffers <em>Size Of Buffers</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BufferPoolImpl#getTotalBuffers <em>Total Buffers</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BufferPoolImpl#getAvailableBuffers <em>Available Buffers</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BufferPoolImpl#getSharedBuffers <em>Shared Buffers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BufferPoolImpl extends CIM_CollectionOfMSEsImpl implements CIM_BufferPool {
	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BUFFER_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected Integer bufferSize = BUFFER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeOfBuffers() <em>Size Of Buffers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeOfBuffers()
	 * @generated
	 * @ordered
	 */
	protected static final Long SIZE_OF_BUFFERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSizeOfBuffers() <em>Size Of Buffers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeOfBuffers()
	 * @generated
	 * @ordered
	 */
	protected Long sizeOfBuffers = SIZE_OF_BUFFERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalBuffers() <em>Total Buffers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBuffers()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_BUFFERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalBuffers() <em>Total Buffers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBuffers()
	 * @generated
	 * @ordered
	 */
	protected Long totalBuffers = TOTAL_BUFFERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableBuffers() <em>Available Buffers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableBuffers()
	 * @generated
	 * @ordered
	 */
	protected static final Long AVAILABLE_BUFFERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailableBuffers() <em>Available Buffers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableBuffers()
	 * @generated
	 * @ordered
	 */
	protected Long availableBuffers = AVAILABLE_BUFFERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSharedBuffers() <em>Shared Buffers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedBuffers()
	 * @generated
	 * @ordered
	 */
	protected static final Long SHARED_BUFFERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSharedBuffers() <em>Shared Buffers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedBuffers()
	 * @generated
	 * @ordered
	 */
	protected Long sharedBuffers = SHARED_BUFFERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BufferPoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BufferPool();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BUFFER_POOL__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BUFFER_POOL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBufferSize() {
		return bufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBufferSize(Integer newBufferSize) {
		Integer oldBufferSize = bufferSize;
		bufferSize = newBufferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BUFFER_POOL__BUFFER_SIZE, oldBufferSize, bufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSizeOfBuffers() {
		return sizeOfBuffers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeOfBuffers(Long newSizeOfBuffers) {
		Long oldSizeOfBuffers = sizeOfBuffers;
		sizeOfBuffers = newSizeOfBuffers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BUFFER_POOL__SIZE_OF_BUFFERS, oldSizeOfBuffers, sizeOfBuffers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalBuffers() {
		return totalBuffers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalBuffers(Long newTotalBuffers) {
		Long oldTotalBuffers = totalBuffers;
		totalBuffers = newTotalBuffers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BUFFER_POOL__TOTAL_BUFFERS, oldTotalBuffers, totalBuffers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAvailableBuffers() {
		return availableBuffers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableBuffers(Long newAvailableBuffers) {
		Long oldAvailableBuffers = availableBuffers;
		availableBuffers = newAvailableBuffers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BUFFER_POOL__AVAILABLE_BUFFERS, oldAvailableBuffers, availableBuffers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSharedBuffers() {
		return sharedBuffers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSharedBuffers(Long newSharedBuffers) {
		Long oldSharedBuffers = sharedBuffers;
		sharedBuffers = newSharedBuffers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BUFFER_POOL__SHARED_BUFFERS, oldSharedBuffers, sharedBuffers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BUFFER_POOL__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_BUFFER_POOL__NAME:
				return getName();
			case CimPackage.CIM_BUFFER_POOL__BUFFER_SIZE:
				return getBufferSize();
			case CimPackage.CIM_BUFFER_POOL__SIZE_OF_BUFFERS:
				return getSizeOfBuffers();
			case CimPackage.CIM_BUFFER_POOL__TOTAL_BUFFERS:
				return getTotalBuffers();
			case CimPackage.CIM_BUFFER_POOL__AVAILABLE_BUFFERS:
				return getAvailableBuffers();
			case CimPackage.CIM_BUFFER_POOL__SHARED_BUFFERS:
				return getSharedBuffers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_BUFFER_POOL__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_BUFFER_POOL__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CIM_BUFFER_POOL__BUFFER_SIZE:
				setBufferSize((Integer)newValue);
				return;
			case CimPackage.CIM_BUFFER_POOL__SIZE_OF_BUFFERS:
				setSizeOfBuffers((Long)newValue);
				return;
			case CimPackage.CIM_BUFFER_POOL__TOTAL_BUFFERS:
				setTotalBuffers((Long)newValue);
				return;
			case CimPackage.CIM_BUFFER_POOL__AVAILABLE_BUFFERS:
				setAvailableBuffers((Long)newValue);
				return;
			case CimPackage.CIM_BUFFER_POOL__SHARED_BUFFERS:
				setSharedBuffers((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_BUFFER_POOL__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_BUFFER_POOL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CIM_BUFFER_POOL__BUFFER_SIZE:
				setBufferSize(BUFFER_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_BUFFER_POOL__SIZE_OF_BUFFERS:
				setSizeOfBuffers(SIZE_OF_BUFFERS_EDEFAULT);
				return;
			case CimPackage.CIM_BUFFER_POOL__TOTAL_BUFFERS:
				setTotalBuffers(TOTAL_BUFFERS_EDEFAULT);
				return;
			case CimPackage.CIM_BUFFER_POOL__AVAILABLE_BUFFERS:
				setAvailableBuffers(AVAILABLE_BUFFERS_EDEFAULT);
				return;
			case CimPackage.CIM_BUFFER_POOL__SHARED_BUFFERS:
				setSharedBuffers(SHARED_BUFFERS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_BUFFER_POOL__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_BUFFER_POOL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CIM_BUFFER_POOL__BUFFER_SIZE:
				return BUFFER_SIZE_EDEFAULT == null ? bufferSize != null : !BUFFER_SIZE_EDEFAULT.equals(bufferSize);
			case CimPackage.CIM_BUFFER_POOL__SIZE_OF_BUFFERS:
				return SIZE_OF_BUFFERS_EDEFAULT == null ? sizeOfBuffers != null : !SIZE_OF_BUFFERS_EDEFAULT.equals(sizeOfBuffers);
			case CimPackage.CIM_BUFFER_POOL__TOTAL_BUFFERS:
				return TOTAL_BUFFERS_EDEFAULT == null ? totalBuffers != null : !TOTAL_BUFFERS_EDEFAULT.equals(totalBuffers);
			case CimPackage.CIM_BUFFER_POOL__AVAILABLE_BUFFERS:
				return AVAILABLE_BUFFERS_EDEFAULT == null ? availableBuffers != null : !AVAILABLE_BUFFERS_EDEFAULT.equals(availableBuffers);
			case CimPackage.CIM_BUFFER_POOL__SHARED_BUFFERS:
				return SHARED_BUFFERS_EDEFAULT == null ? sharedBuffers != null : !SHARED_BUFFERS_EDEFAULT.equals(sharedBuffers);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (CreationClassName: ");
		result.append(creationClassName);
		result.append(", Name: ");
		result.append(name);
		result.append(", BufferSize: ");
		result.append(bufferSize);
		result.append(", SizeOfBuffers: ");
		result.append(sizeOfBuffers);
		result.append(", TotalBuffers: ");
		result.append(totalBuffers);
		result.append(", AvailableBuffers: ");
		result.append(availableBuffers);
		result.append(", SharedBuffers: ");
		result.append(sharedBuffers);
		result.append(')');
		return result.toString();
	}

} //CIM_BufferPoolImpl
