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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CIM_FileSystemCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM File System Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemCapabilitiesImpl#getSupportedPersistenceTypes <em>Supported Persistence Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemCapabilitiesImpl#getSupportedOtherPersistenceTypes <em>Supported Other Persistence Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemCapabilitiesImpl#getActualFileSystemType <em>Actual File System Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemCapabilitiesImpl#getSupportedObjectTypes <em>Supported Object Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemCapabilitiesImpl#getSupportedOperations <em>Supported Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemCapabilitiesImpl#getSupportedProperties <em>Supported Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FileSystemCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_FileSystemCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedPersistenceTypes() <em>Supported Persistence Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedPersistenceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedPersistenceTypes;

	/**
	 * The cached value of the '{@link #getSupportedOtherPersistenceTypes() <em>Supported Other Persistence Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedOtherPersistenceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> supportedOtherPersistenceTypes;

	/**
	 * The default value of the '{@link #getActualFileSystemType() <em>Actual File System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualFileSystemType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACTUAL_FILE_SYSTEM_TYPE_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getActualFileSystemType() <em>Actual File System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualFileSystemType()
	 * @generated
	 * @ordered
	 */
	protected Integer actualFileSystemType = ACTUAL_FILE_SYSTEM_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedObjectTypes() <em>Supported Object Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedObjectTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedObjectTypes;

	/**
	 * The cached value of the '{@link #getSupportedOperations() <em>Supported Operations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedOperations;

	/**
	 * The cached value of the '{@link #getSupportedProperties() <em>Supported Properties</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FileSystemCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FileSystemCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedPersistenceTypes() {
		if (supportedPersistenceTypes == null) {
			supportedPersistenceTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_PERSISTENCE_TYPES);
		}
		return supportedPersistenceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSupportedOtherPersistenceTypes() {
		if (supportedOtherPersistenceTypes == null) {
			supportedOtherPersistenceTypes = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_OTHER_PERSISTENCE_TYPES);
		}
		return supportedOtherPersistenceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getActualFileSystemType() {
		return actualFileSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualFileSystemType(Integer newActualFileSystemType) {
		Integer oldActualFileSystemType = actualFileSystemType;
		actualFileSystemType = newActualFileSystemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__ACTUAL_FILE_SYSTEM_TYPE, oldActualFileSystemType, actualFileSystemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedObjectTypes() {
		if (supportedObjectTypes == null) {
			supportedObjectTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_OBJECT_TYPES);
		}
		return supportedObjectTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedOperations() {
		if (supportedOperations == null) {
			supportedOperations = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_OPERATIONS);
		}
		return supportedOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedProperties() {
		if (supportedProperties == null) {
			supportedProperties = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_PROPERTIES);
		}
		return supportedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer CreateGoal(CIM_ConcreteJob Job, String TemplateGoal, String SupportedGoal) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetElementNameCapabilities(EList<Long> SupportedFeatures, String ElementNameMask, Integer MaxElementNameLen) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetRequiredStorageSize(String FileSystemGoal, String ExtentSetting, Long ExpectedSize, Long MinimumSizeAcceptable, Long MaximumSizeUsable) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_PERSISTENCE_TYPES:
				return getSupportedPersistenceTypes();
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_OTHER_PERSISTENCE_TYPES:
				return getSupportedOtherPersistenceTypes();
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__ACTUAL_FILE_SYSTEM_TYPE:
				return getActualFileSystemType();
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_OBJECT_TYPES:
				return getSupportedObjectTypes();
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_OPERATIONS:
				return getSupportedOperations();
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_PROPERTIES:
				return getSupportedProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_PERSISTENCE_TYPES:
				getSupportedPersistenceTypes().clear();
				getSupportedPersistenceTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_OTHER_PERSISTENCE_TYPES:
				getSupportedOtherPersistenceTypes().clear();
				getSupportedOtherPersistenceTypes().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__ACTUAL_FILE_SYSTEM_TYPE:
				setActualFileSystemType((Integer)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_OBJECT_TYPES:
				getSupportedObjectTypes().clear();
				getSupportedObjectTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_OPERATIONS:
				getSupportedOperations().clear();
				getSupportedOperations().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_PROPERTIES:
				getSupportedProperties().clear();
				getSupportedProperties().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_PERSISTENCE_TYPES:
				getSupportedPersistenceTypes().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_OTHER_PERSISTENCE_TYPES:
				getSupportedOtherPersistenceTypes().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__ACTUAL_FILE_SYSTEM_TYPE:
				setActualFileSystemType(ACTUAL_FILE_SYSTEM_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_OBJECT_TYPES:
				getSupportedObjectTypes().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_OPERATIONS:
				getSupportedOperations().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_PROPERTIES:
				getSupportedProperties().clear();
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
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_PERSISTENCE_TYPES:
				return supportedPersistenceTypes != null && !supportedPersistenceTypes.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_OTHER_PERSISTENCE_TYPES:
				return supportedOtherPersistenceTypes != null && !supportedOtherPersistenceTypes.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__ACTUAL_FILE_SYSTEM_TYPE:
				return ACTUAL_FILE_SYSTEM_TYPE_EDEFAULT == null ? actualFileSystemType != null : !ACTUAL_FILE_SYSTEM_TYPE_EDEFAULT.equals(actualFileSystemType);
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_OBJECT_TYPES:
				return supportedObjectTypes != null && !supportedObjectTypes.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_OPERATIONS:
				return supportedOperations != null && !supportedOperations.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES__SUPPORTED_PROPERTIES:
				return supportedProperties != null && !supportedProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES___CREATE_GOAL__CIM_CONCRETEJOB_STRING_STRING:
				return CreateGoal((CIM_ConcreteJob)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES___GET_ELEMENT_NAME_CAPABILITIES__ELIST_STRING_INTEGER:
				return GetElementNameCapabilities((EList<Long>)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES___GET_REQUIRED_STORAGE_SIZE__STRING_STRING_LONG_LONG_LONG:
				return GetRequiredStorageSize((String)arguments.get(0), (String)arguments.get(1), (Long)arguments.get(2), (Long)arguments.get(3), (Long)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (SupportedPersistenceTypes: ");
		result.append(supportedPersistenceTypes);
		result.append(", SupportedOtherPersistenceTypes: ");
		result.append(supportedOtherPersistenceTypes);
		result.append(", ActualFileSystemType: ");
		result.append(actualFileSystemType);
		result.append(", SupportedObjectTypes: ");
		result.append(supportedObjectTypes);
		result.append(", SupportedOperations: ");
		result.append(supportedOperations);
		result.append(", SupportedProperties: ");
		result.append(supportedProperties);
		result.append(')');
		return result.toString();
	}

} //CIM_FileSystemCapabilitiesImpl
