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

import org.dmtf.cim.CIM_MemoryMappedIO;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Memory Mapped IO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryMappedIOImpl#getCSCreationClassName <em>CS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryMappedIOImpl#getCSName <em>CS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryMappedIOImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryMappedIOImpl#getStartingAddress <em>Starting Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryMappedIOImpl#getEndingAddress <em>Ending Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryMappedIOImpl#getMappedResource <em>Mapped Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MemoryMappedIOImpl extends CIM_SystemResourceImpl implements CIM_MemoryMappedIO {
	/**
	 * The default value of the '{@link #getCSCreationClassName() <em>CS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCSCreationClassName() <em>CS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String csCreationClassName = CS_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCSName() <em>CS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCSName() <em>CS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSName()
	 * @generated
	 * @ordered
	 */
	protected String csName = CS_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getStartingAddress() <em>Starting Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingAddress()
	 * @generated
	 * @ordered
	 */
	protected static final Long STARTING_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartingAddress() <em>Starting Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingAddress()
	 * @generated
	 * @ordered
	 */
	protected Long startingAddress = STARTING_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndingAddress() <em>Ending Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingAddress()
	 * @generated
	 * @ordered
	 */
	protected static final Long ENDING_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndingAddress() <em>Ending Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingAddress()
	 * @generated
	 * @ordered
	 */
	protected Long endingAddress = ENDING_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMappedResource() <em>Mapped Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedResource()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAPPED_RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMappedResource() <em>Mapped Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedResource()
	 * @generated
	 * @ordered
	 */
	protected Integer mappedResource = MAPPED_RESOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MemoryMappedIOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MemoryMappedIO();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCSCreationClassName() {
		return csCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCSCreationClassName(String newCSCreationClassName) {
		String oldCSCreationClassName = csCreationClassName;
		csCreationClassName = newCSCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY_MAPPED_IO__CS_CREATION_CLASS_NAME, oldCSCreationClassName, csCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCSName() {
		return csName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCSName(String newCSName) {
		String oldCSName = csName;
		csName = newCSName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY_MAPPED_IO__CS_NAME, oldCSName, csName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY_MAPPED_IO__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getStartingAddress() {
		return startingAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartingAddress(Long newStartingAddress) {
		Long oldStartingAddress = startingAddress;
		startingAddress = newStartingAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY_MAPPED_IO__STARTING_ADDRESS, oldStartingAddress, startingAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getEndingAddress() {
		return endingAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndingAddress(Long newEndingAddress) {
		Long oldEndingAddress = endingAddress;
		endingAddress = newEndingAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY_MAPPED_IO__ENDING_ADDRESS, oldEndingAddress, endingAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMappedResource() {
		return mappedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMappedResource(Integer newMappedResource) {
		Integer oldMappedResource = mappedResource;
		mappedResource = newMappedResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY_MAPPED_IO__MAPPED_RESOURCE, oldMappedResource, mappedResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_MEMORY_MAPPED_IO__CS_CREATION_CLASS_NAME:
				return getCSCreationClassName();
			case CimPackage.CIM_MEMORY_MAPPED_IO__CS_NAME:
				return getCSName();
			case CimPackage.CIM_MEMORY_MAPPED_IO__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_MEMORY_MAPPED_IO__STARTING_ADDRESS:
				return getStartingAddress();
			case CimPackage.CIM_MEMORY_MAPPED_IO__ENDING_ADDRESS:
				return getEndingAddress();
			case CimPackage.CIM_MEMORY_MAPPED_IO__MAPPED_RESOURCE:
				return getMappedResource();
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
			case CimPackage.CIM_MEMORY_MAPPED_IO__CS_CREATION_CLASS_NAME:
				setCSCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_MEMORY_MAPPED_IO__CS_NAME:
				setCSName((String)newValue);
				return;
			case CimPackage.CIM_MEMORY_MAPPED_IO__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_MEMORY_MAPPED_IO__STARTING_ADDRESS:
				setStartingAddress((Long)newValue);
				return;
			case CimPackage.CIM_MEMORY_MAPPED_IO__ENDING_ADDRESS:
				setEndingAddress((Long)newValue);
				return;
			case CimPackage.CIM_MEMORY_MAPPED_IO__MAPPED_RESOURCE:
				setMappedResource((Integer)newValue);
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
			case CimPackage.CIM_MEMORY_MAPPED_IO__CS_CREATION_CLASS_NAME:
				setCSCreationClassName(CS_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY_MAPPED_IO__CS_NAME:
				setCSName(CS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY_MAPPED_IO__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY_MAPPED_IO__STARTING_ADDRESS:
				setStartingAddress(STARTING_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY_MAPPED_IO__ENDING_ADDRESS:
				setEndingAddress(ENDING_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY_MAPPED_IO__MAPPED_RESOURCE:
				setMappedResource(MAPPED_RESOURCE_EDEFAULT);
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
			case CimPackage.CIM_MEMORY_MAPPED_IO__CS_CREATION_CLASS_NAME:
				return CS_CREATION_CLASS_NAME_EDEFAULT == null ? csCreationClassName != null : !CS_CREATION_CLASS_NAME_EDEFAULT.equals(csCreationClassName);
			case CimPackage.CIM_MEMORY_MAPPED_IO__CS_NAME:
				return CS_NAME_EDEFAULT == null ? csName != null : !CS_NAME_EDEFAULT.equals(csName);
			case CimPackage.CIM_MEMORY_MAPPED_IO__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_MEMORY_MAPPED_IO__STARTING_ADDRESS:
				return STARTING_ADDRESS_EDEFAULT == null ? startingAddress != null : !STARTING_ADDRESS_EDEFAULT.equals(startingAddress);
			case CimPackage.CIM_MEMORY_MAPPED_IO__ENDING_ADDRESS:
				return ENDING_ADDRESS_EDEFAULT == null ? endingAddress != null : !ENDING_ADDRESS_EDEFAULT.equals(endingAddress);
			case CimPackage.CIM_MEMORY_MAPPED_IO__MAPPED_RESOURCE:
				return MAPPED_RESOURCE_EDEFAULT == null ? mappedResource != null : !MAPPED_RESOURCE_EDEFAULT.equals(mappedResource);
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
		result.append(" (CSCreationClassName: ");
		result.append(csCreationClassName);
		result.append(", CSName: ");
		result.append(csName);
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", StartingAddress: ");
		result.append(startingAddress);
		result.append(", EndingAddress: ");
		result.append(endingAddress);
		result.append(", MappedResource: ");
		result.append(mappedResource);
		result.append(')');
		return result.toString();
	}

} //CIM_MemoryMappedIOImpl
