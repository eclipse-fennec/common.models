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

import java.util.Collection;

import org.dmtf.cim.CIM_LocallyAccessibleFileSystemCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Locally Accessible File System Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemCapabilitiesImpl#getSupportedProperties <em>Supported Properties</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LocallyAccessibleFileSystemCapabilitiesImpl#getSupportedObjectsForAttributeCaching <em>Supported Objects For Attribute Caching</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LocallyAccessibleFileSystemCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_LocallyAccessibleFileSystemCapabilities {
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
	 * The cached value of the '{@link #getSupportedObjectsForAttributeCaching() <em>Supported Objects For Attribute Caching</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedObjectsForAttributeCaching()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedObjectsForAttributeCaching;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LocallyAccessibleFileSystemCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LocallyAccessibleFileSystemCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedProperties() {
		if (supportedProperties == null) {
			supportedProperties = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_CAPABILITIES__SUPPORTED_PROPERTIES);
		}
		return supportedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedObjectsForAttributeCaching() {
		if (supportedObjectsForAttributeCaching == null) {
			supportedObjectsForAttributeCaching = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_CAPABILITIES__SUPPORTED_OBJECTS_FOR_ATTRIBUTE_CACHING);
		}
		return supportedObjectsForAttributeCaching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_CAPABILITIES__SUPPORTED_PROPERTIES:
				return getSupportedProperties();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_CAPABILITIES__SUPPORTED_OBJECTS_FOR_ATTRIBUTE_CACHING:
				return getSupportedObjectsForAttributeCaching();
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
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_CAPABILITIES__SUPPORTED_PROPERTIES:
				getSupportedProperties().clear();
				getSupportedProperties().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_CAPABILITIES__SUPPORTED_OBJECTS_FOR_ATTRIBUTE_CACHING:
				getSupportedObjectsForAttributeCaching().clear();
				getSupportedObjectsForAttributeCaching().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_CAPABILITIES__SUPPORTED_PROPERTIES:
				getSupportedProperties().clear();
				return;
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_CAPABILITIES__SUPPORTED_OBJECTS_FOR_ATTRIBUTE_CACHING:
				getSupportedObjectsForAttributeCaching().clear();
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
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_CAPABILITIES__SUPPORTED_PROPERTIES:
				return supportedProperties != null && !supportedProperties.isEmpty();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_CAPABILITIES__SUPPORTED_OBJECTS_FOR_ATTRIBUTE_CACHING:
				return supportedObjectsForAttributeCaching != null && !supportedObjectsForAttributeCaching.isEmpty();
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
		result.append(" (SupportedProperties: ");
		result.append(supportedProperties);
		result.append(", SupportedObjectsForAttributeCaching: ");
		result.append(supportedObjectsForAttributeCaching);
		result.append(')');
		return result.toString();
	}

} //CIM_LocallyAccessibleFileSystemCapabilitiesImpl
