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

import org.dmtf.cim.CIM_RegisteredSpecification;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Registered Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RegisteredSpecificationImpl#getSpecificationType <em>Specification Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RegisteredSpecificationImpl#getOtherSpecificationType <em>Other Specification Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RegisteredSpecificationImpl#getRegisteredOrganization <em>Registered Organization</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RegisteredSpecificationImpl#getOtherRegisteredOrganization <em>Other Registered Organization</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RegisteredSpecificationImpl#getRegisteredName <em>Registered Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RegisteredSpecificationImpl#getRegisteredVersion <em>Registered Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RegisteredSpecificationImpl#getAdvertiseTypes <em>Advertise Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RegisteredSpecificationImpl#getAdvertiseTypeDescriptions <em>Advertise Type Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RegisteredSpecificationImpl extends CIM_ManagedElementImpl implements CIM_RegisteredSpecification {
	/**
	 * The default value of the '{@link #getSpecificationType() <em>Specification Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SPECIFICATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificationType() <em>Specification Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationType()
	 * @generated
	 * @ordered
	 */
	protected Integer specificationType = SPECIFICATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherSpecificationType() <em>Other Specification Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSpecificationType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_SPECIFICATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherSpecificationType() <em>Other Specification Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSpecificationType()
	 * @generated
	 * @ordered
	 */
	protected String otherSpecificationType = OTHER_SPECIFICATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegisteredOrganization() <em>Registered Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredOrganization()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REGISTERED_ORGANIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegisteredOrganization() <em>Registered Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredOrganization()
	 * @generated
	 * @ordered
	 */
	protected Integer registeredOrganization = REGISTERED_ORGANIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherRegisteredOrganization() <em>Other Registered Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRegisteredOrganization()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_REGISTERED_ORGANIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherRegisteredOrganization() <em>Other Registered Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRegisteredOrganization()
	 * @generated
	 * @ordered
	 */
	protected String otherRegisteredOrganization = OTHER_REGISTERED_ORGANIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegisteredName() <em>Registered Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredName()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTERED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegisteredName() <em>Registered Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredName()
	 * @generated
	 * @ordered
	 */
	protected String registeredName = REGISTERED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegisteredVersion() <em>Registered Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTERED_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegisteredVersion() <em>Registered Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredVersion()
	 * @generated
	 * @ordered
	 */
	protected String registeredVersion = REGISTERED_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAdvertiseTypes() <em>Advertise Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvertiseTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> advertiseTypes;

	/**
	 * The cached value of the '{@link #getAdvertiseTypeDescriptions() <em>Advertise Type Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvertiseTypeDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> advertiseTypeDescriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RegisteredSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RegisteredSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSpecificationType() {
		return specificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecificationType(Integer newSpecificationType) {
		Integer oldSpecificationType = specificationType;
		specificationType = newSpecificationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REGISTERED_SPECIFICATION__SPECIFICATION_TYPE, oldSpecificationType, specificationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherSpecificationType() {
		return otherSpecificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherSpecificationType(String newOtherSpecificationType) {
		String oldOtherSpecificationType = otherSpecificationType;
		otherSpecificationType = newOtherSpecificationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REGISTERED_SPECIFICATION__OTHER_SPECIFICATION_TYPE, oldOtherSpecificationType, otherSpecificationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRegisteredOrganization() {
		return registeredOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegisteredOrganization(Integer newRegisteredOrganization) {
		Integer oldRegisteredOrganization = registeredOrganization;
		registeredOrganization = newRegisteredOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REGISTERED_SPECIFICATION__REGISTERED_ORGANIZATION, oldRegisteredOrganization, registeredOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherRegisteredOrganization() {
		return otherRegisteredOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherRegisteredOrganization(String newOtherRegisteredOrganization) {
		String oldOtherRegisteredOrganization = otherRegisteredOrganization;
		otherRegisteredOrganization = newOtherRegisteredOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REGISTERED_SPECIFICATION__OTHER_REGISTERED_ORGANIZATION, oldOtherRegisteredOrganization, otherRegisteredOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegisteredName() {
		return registeredName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegisteredName(String newRegisteredName) {
		String oldRegisteredName = registeredName;
		registeredName = newRegisteredName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REGISTERED_SPECIFICATION__REGISTERED_NAME, oldRegisteredName, registeredName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegisteredVersion() {
		return registeredVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegisteredVersion(String newRegisteredVersion) {
		String oldRegisteredVersion = registeredVersion;
		registeredVersion = newRegisteredVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REGISTERED_SPECIFICATION__REGISTERED_VERSION, oldRegisteredVersion, registeredVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAdvertiseTypes() {
		if (advertiseTypes == null) {
			advertiseTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_REGISTERED_SPECIFICATION__ADVERTISE_TYPES);
		}
		return advertiseTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAdvertiseTypeDescriptions() {
		if (advertiseTypeDescriptions == null) {
			advertiseTypeDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_REGISTERED_SPECIFICATION__ADVERTISE_TYPE_DESCRIPTIONS);
		}
		return advertiseTypeDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_REGISTERED_SPECIFICATION__SPECIFICATION_TYPE:
				return getSpecificationType();
			case CimPackage.CIM_REGISTERED_SPECIFICATION__OTHER_SPECIFICATION_TYPE:
				return getOtherSpecificationType();
			case CimPackage.CIM_REGISTERED_SPECIFICATION__REGISTERED_ORGANIZATION:
				return getRegisteredOrganization();
			case CimPackage.CIM_REGISTERED_SPECIFICATION__OTHER_REGISTERED_ORGANIZATION:
				return getOtherRegisteredOrganization();
			case CimPackage.CIM_REGISTERED_SPECIFICATION__REGISTERED_NAME:
				return getRegisteredName();
			case CimPackage.CIM_REGISTERED_SPECIFICATION__REGISTERED_VERSION:
				return getRegisteredVersion();
			case CimPackage.CIM_REGISTERED_SPECIFICATION__ADVERTISE_TYPES:
				return getAdvertiseTypes();
			case CimPackage.CIM_REGISTERED_SPECIFICATION__ADVERTISE_TYPE_DESCRIPTIONS:
				return getAdvertiseTypeDescriptions();
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
			case CimPackage.CIM_REGISTERED_SPECIFICATION__SPECIFICATION_TYPE:
				setSpecificationType((Integer)newValue);
				return;
			case CimPackage.CIM_REGISTERED_SPECIFICATION__OTHER_SPECIFICATION_TYPE:
				setOtherSpecificationType((String)newValue);
				return;
			case CimPackage.CIM_REGISTERED_SPECIFICATION__REGISTERED_ORGANIZATION:
				setRegisteredOrganization((Integer)newValue);
				return;
			case CimPackage.CIM_REGISTERED_SPECIFICATION__OTHER_REGISTERED_ORGANIZATION:
				setOtherRegisteredOrganization((String)newValue);
				return;
			case CimPackage.CIM_REGISTERED_SPECIFICATION__REGISTERED_NAME:
				setRegisteredName((String)newValue);
				return;
			case CimPackage.CIM_REGISTERED_SPECIFICATION__REGISTERED_VERSION:
				setRegisteredVersion((String)newValue);
				return;
			case CimPackage.CIM_REGISTERED_SPECIFICATION__ADVERTISE_TYPES:
				getAdvertiseTypes().clear();
				getAdvertiseTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_REGISTERED_SPECIFICATION__ADVERTISE_TYPE_DESCRIPTIONS:
				getAdvertiseTypeDescriptions().clear();
				getAdvertiseTypeDescriptions().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_REGISTERED_SPECIFICATION__SPECIFICATION_TYPE:
				setSpecificationType(SPECIFICATION_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_REGISTERED_SPECIFICATION__OTHER_SPECIFICATION_TYPE:
				setOtherSpecificationType(OTHER_SPECIFICATION_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_REGISTERED_SPECIFICATION__REGISTERED_ORGANIZATION:
				setRegisteredOrganization(REGISTERED_ORGANIZATION_EDEFAULT);
				return;
			case CimPackage.CIM_REGISTERED_SPECIFICATION__OTHER_REGISTERED_ORGANIZATION:
				setOtherRegisteredOrganization(OTHER_REGISTERED_ORGANIZATION_EDEFAULT);
				return;
			case CimPackage.CIM_REGISTERED_SPECIFICATION__REGISTERED_NAME:
				setRegisteredName(REGISTERED_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_REGISTERED_SPECIFICATION__REGISTERED_VERSION:
				setRegisteredVersion(REGISTERED_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_REGISTERED_SPECIFICATION__ADVERTISE_TYPES:
				getAdvertiseTypes().clear();
				return;
			case CimPackage.CIM_REGISTERED_SPECIFICATION__ADVERTISE_TYPE_DESCRIPTIONS:
				getAdvertiseTypeDescriptions().clear();
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
			case CimPackage.CIM_REGISTERED_SPECIFICATION__SPECIFICATION_TYPE:
				return SPECIFICATION_TYPE_EDEFAULT == null ? specificationType != null : !SPECIFICATION_TYPE_EDEFAULT.equals(specificationType);
			case CimPackage.CIM_REGISTERED_SPECIFICATION__OTHER_SPECIFICATION_TYPE:
				return OTHER_SPECIFICATION_TYPE_EDEFAULT == null ? otherSpecificationType != null : !OTHER_SPECIFICATION_TYPE_EDEFAULT.equals(otherSpecificationType);
			case CimPackage.CIM_REGISTERED_SPECIFICATION__REGISTERED_ORGANIZATION:
				return REGISTERED_ORGANIZATION_EDEFAULT == null ? registeredOrganization != null : !REGISTERED_ORGANIZATION_EDEFAULT.equals(registeredOrganization);
			case CimPackage.CIM_REGISTERED_SPECIFICATION__OTHER_REGISTERED_ORGANIZATION:
				return OTHER_REGISTERED_ORGANIZATION_EDEFAULT == null ? otherRegisteredOrganization != null : !OTHER_REGISTERED_ORGANIZATION_EDEFAULT.equals(otherRegisteredOrganization);
			case CimPackage.CIM_REGISTERED_SPECIFICATION__REGISTERED_NAME:
				return REGISTERED_NAME_EDEFAULT == null ? registeredName != null : !REGISTERED_NAME_EDEFAULT.equals(registeredName);
			case CimPackage.CIM_REGISTERED_SPECIFICATION__REGISTERED_VERSION:
				return REGISTERED_VERSION_EDEFAULT == null ? registeredVersion != null : !REGISTERED_VERSION_EDEFAULT.equals(registeredVersion);
			case CimPackage.CIM_REGISTERED_SPECIFICATION__ADVERTISE_TYPES:
				return advertiseTypes != null && !advertiseTypes.isEmpty();
			case CimPackage.CIM_REGISTERED_SPECIFICATION__ADVERTISE_TYPE_DESCRIPTIONS:
				return advertiseTypeDescriptions != null && !advertiseTypeDescriptions.isEmpty();
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
		result.append(" (SpecificationType: ");
		result.append(specificationType);
		result.append(", OtherSpecificationType: ");
		result.append(otherSpecificationType);
		result.append(", RegisteredOrganization: ");
		result.append(registeredOrganization);
		result.append(", OtherRegisteredOrganization: ");
		result.append(otherRegisteredOrganization);
		result.append(", RegisteredName: ");
		result.append(registeredName);
		result.append(", RegisteredVersion: ");
		result.append(registeredVersion);
		result.append(", AdvertiseTypes: ");
		result.append(advertiseTypes);
		result.append(", AdvertiseTypeDescriptions: ");
		result.append(advertiseTypeDescriptions);
		result.append(')');
		return result.toString();
	}

} //CIM_RegisteredSpecificationImpl
