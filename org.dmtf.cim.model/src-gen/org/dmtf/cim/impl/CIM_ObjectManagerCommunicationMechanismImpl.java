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

import org.dmtf.cim.CIM_ObjectManagerCommunicationMechanism;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Object Manager Communication Mechanism</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ObjectManagerCommunicationMechanismImpl#getCommunicationMechanism <em>Communication Mechanism</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ObjectManagerCommunicationMechanismImpl#getOtherCommunicationMechanismDescription <em>Other Communication Mechanism Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ObjectManagerCommunicationMechanismImpl#getFunctionalProfilesSupported <em>Functional Profiles Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ObjectManagerCommunicationMechanismImpl#getFunctionalProfileDescriptions <em>Functional Profile Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ObjectManagerCommunicationMechanismImpl#getMultipleOperationsSupported <em>Multiple Operations Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ObjectManagerCommunicationMechanismImpl#getAuthenticationMechanismsSupported <em>Authentication Mechanisms Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ObjectManagerCommunicationMechanismImpl#getAuthenticationMechanismDescriptions <em>Authentication Mechanism Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ObjectManagerCommunicationMechanismImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ObjectManagerCommunicationMechanismImpl#getAdvertiseTypes <em>Advertise Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ObjectManagerCommunicationMechanismImpl#getAdvertiseTypeDescriptions <em>Advertise Type Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ObjectManagerCommunicationMechanismImpl extends CIM_ServiceAccessPointImpl implements CIM_ObjectManagerCommunicationMechanism {
	/**
	 * The default value of the '{@link #getCommunicationMechanism() <em>Communication Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COMMUNICATION_MECHANISM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommunicationMechanism() <em>Communication Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationMechanism()
	 * @generated
	 * @ordered
	 */
	protected Integer communicationMechanism = COMMUNICATION_MECHANISM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherCommunicationMechanismDescription() <em>Other Communication Mechanism Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCommunicationMechanismDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_COMMUNICATION_MECHANISM_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherCommunicationMechanismDescription() <em>Other Communication Mechanism Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCommunicationMechanismDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherCommunicationMechanismDescription = OTHER_COMMUNICATION_MECHANISM_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFunctionalProfilesSupported() <em>Functional Profiles Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalProfilesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> functionalProfilesSupported;

	/**
	 * The cached value of the '{@link #getFunctionalProfileDescriptions() <em>Functional Profile Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalProfileDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> functionalProfileDescriptions;

	/**
	 * The default value of the '{@link #getMultipleOperationsSupported() <em>Multiple Operations Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOperationsSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MULTIPLE_OPERATIONS_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultipleOperationsSupported() <em>Multiple Operations Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOperationsSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean multipleOperationsSupported = MULTIPLE_OPERATIONS_SUPPORTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthenticationMechanismsSupported() <em>Authentication Mechanisms Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationMechanismsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> authenticationMechanismsSupported;

	/**
	 * The cached value of the '{@link #getAuthenticationMechanismDescriptions() <em>Authentication Mechanism Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationMechanismDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> authenticationMechanismDescriptions;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

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
	protected CIM_ObjectManagerCommunicationMechanismImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ObjectManagerCommunicationMechanism();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCommunicationMechanism() {
		return communicationMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationMechanism(Integer newCommunicationMechanism) {
		Integer oldCommunicationMechanism = communicationMechanism;
		communicationMechanism = newCommunicationMechanism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__COMMUNICATION_MECHANISM, oldCommunicationMechanism, communicationMechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherCommunicationMechanismDescription() {
		return otherCommunicationMechanismDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherCommunicationMechanismDescription(String newOtherCommunicationMechanismDescription) {
		String oldOtherCommunicationMechanismDescription = otherCommunicationMechanismDescription;
		otherCommunicationMechanismDescription = newOtherCommunicationMechanismDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__OTHER_COMMUNICATION_MECHANISM_DESCRIPTION, oldOtherCommunicationMechanismDescription, otherCommunicationMechanismDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getFunctionalProfilesSupported() {
		if (functionalProfilesSupported == null) {
			functionalProfilesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__FUNCTIONAL_PROFILES_SUPPORTED);
		}
		return functionalProfilesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getFunctionalProfileDescriptions() {
		if (functionalProfileDescriptions == null) {
			functionalProfileDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__FUNCTIONAL_PROFILE_DESCRIPTIONS);
		}
		return functionalProfileDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getMultipleOperationsSupported() {
		return multipleOperationsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultipleOperationsSupported(Boolean newMultipleOperationsSupported) {
		Boolean oldMultipleOperationsSupported = multipleOperationsSupported;
		multipleOperationsSupported = newMultipleOperationsSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__MULTIPLE_OPERATIONS_SUPPORTED, oldMultipleOperationsSupported, multipleOperationsSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAuthenticationMechanismsSupported() {
		if (authenticationMechanismsSupported == null) {
			authenticationMechanismsSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__AUTHENTICATION_MECHANISMS_SUPPORTED);
		}
		return authenticationMechanismsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAuthenticationMechanismDescriptions() {
		if (authenticationMechanismDescriptions == null) {
			authenticationMechanismDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__AUTHENTICATION_MECHANISM_DESCRIPTIONS);
		}
		return authenticationMechanismDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAdvertiseTypes() {
		if (advertiseTypes == null) {
			advertiseTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__ADVERTISE_TYPES);
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
			advertiseTypeDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__ADVERTISE_TYPE_DESCRIPTIONS);
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
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__COMMUNICATION_MECHANISM:
				return getCommunicationMechanism();
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__OTHER_COMMUNICATION_MECHANISM_DESCRIPTION:
				return getOtherCommunicationMechanismDescription();
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__FUNCTIONAL_PROFILES_SUPPORTED:
				return getFunctionalProfilesSupported();
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__FUNCTIONAL_PROFILE_DESCRIPTIONS:
				return getFunctionalProfileDescriptions();
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__MULTIPLE_OPERATIONS_SUPPORTED:
				return getMultipleOperationsSupported();
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__AUTHENTICATION_MECHANISMS_SUPPORTED:
				return getAuthenticationMechanismsSupported();
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__AUTHENTICATION_MECHANISM_DESCRIPTIONS:
				return getAuthenticationMechanismDescriptions();
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__VERSION:
				return getVersion();
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__ADVERTISE_TYPES:
				return getAdvertiseTypes();
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__ADVERTISE_TYPE_DESCRIPTIONS:
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
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__COMMUNICATION_MECHANISM:
				setCommunicationMechanism((Integer)newValue);
				return;
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__OTHER_COMMUNICATION_MECHANISM_DESCRIPTION:
				setOtherCommunicationMechanismDescription((String)newValue);
				return;
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__FUNCTIONAL_PROFILES_SUPPORTED:
				getFunctionalProfilesSupported().clear();
				getFunctionalProfilesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__FUNCTIONAL_PROFILE_DESCRIPTIONS:
				getFunctionalProfileDescriptions().clear();
				getFunctionalProfileDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__MULTIPLE_OPERATIONS_SUPPORTED:
				setMultipleOperationsSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__AUTHENTICATION_MECHANISMS_SUPPORTED:
				getAuthenticationMechanismsSupported().clear();
				getAuthenticationMechanismsSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__AUTHENTICATION_MECHANISM_DESCRIPTIONS:
				getAuthenticationMechanismDescriptions().clear();
				getAuthenticationMechanismDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__VERSION:
				setVersion((String)newValue);
				return;
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__ADVERTISE_TYPES:
				getAdvertiseTypes().clear();
				getAdvertiseTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__ADVERTISE_TYPE_DESCRIPTIONS:
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
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__COMMUNICATION_MECHANISM:
				setCommunicationMechanism(COMMUNICATION_MECHANISM_EDEFAULT);
				return;
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__OTHER_COMMUNICATION_MECHANISM_DESCRIPTION:
				setOtherCommunicationMechanismDescription(OTHER_COMMUNICATION_MECHANISM_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__FUNCTIONAL_PROFILES_SUPPORTED:
				getFunctionalProfilesSupported().clear();
				return;
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__FUNCTIONAL_PROFILE_DESCRIPTIONS:
				getFunctionalProfileDescriptions().clear();
				return;
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__MULTIPLE_OPERATIONS_SUPPORTED:
				setMultipleOperationsSupported(MULTIPLE_OPERATIONS_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__AUTHENTICATION_MECHANISMS_SUPPORTED:
				getAuthenticationMechanismsSupported().clear();
				return;
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__AUTHENTICATION_MECHANISM_DESCRIPTIONS:
				getAuthenticationMechanismDescriptions().clear();
				return;
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__ADVERTISE_TYPES:
				getAdvertiseTypes().clear();
				return;
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__ADVERTISE_TYPE_DESCRIPTIONS:
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
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__COMMUNICATION_MECHANISM:
				return COMMUNICATION_MECHANISM_EDEFAULT == null ? communicationMechanism != null : !COMMUNICATION_MECHANISM_EDEFAULT.equals(communicationMechanism);
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__OTHER_COMMUNICATION_MECHANISM_DESCRIPTION:
				return OTHER_COMMUNICATION_MECHANISM_DESCRIPTION_EDEFAULT == null ? otherCommunicationMechanismDescription != null : !OTHER_COMMUNICATION_MECHANISM_DESCRIPTION_EDEFAULT.equals(otherCommunicationMechanismDescription);
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__FUNCTIONAL_PROFILES_SUPPORTED:
				return functionalProfilesSupported != null && !functionalProfilesSupported.isEmpty();
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__FUNCTIONAL_PROFILE_DESCRIPTIONS:
				return functionalProfileDescriptions != null && !functionalProfileDescriptions.isEmpty();
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__MULTIPLE_OPERATIONS_SUPPORTED:
				return MULTIPLE_OPERATIONS_SUPPORTED_EDEFAULT == null ? multipleOperationsSupported != null : !MULTIPLE_OPERATIONS_SUPPORTED_EDEFAULT.equals(multipleOperationsSupported);
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__AUTHENTICATION_MECHANISMS_SUPPORTED:
				return authenticationMechanismsSupported != null && !authenticationMechanismsSupported.isEmpty();
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__AUTHENTICATION_MECHANISM_DESCRIPTIONS:
				return authenticationMechanismDescriptions != null && !authenticationMechanismDescriptions.isEmpty();
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__ADVERTISE_TYPES:
				return advertiseTypes != null && !advertiseTypes.isEmpty();
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM__ADVERTISE_TYPE_DESCRIPTIONS:
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
		result.append(" (CommunicationMechanism: ");
		result.append(communicationMechanism);
		result.append(", OtherCommunicationMechanismDescription: ");
		result.append(otherCommunicationMechanismDescription);
		result.append(", FunctionalProfilesSupported: ");
		result.append(functionalProfilesSupported);
		result.append(", FunctionalProfileDescriptions: ");
		result.append(functionalProfileDescriptions);
		result.append(", MultipleOperationsSupported: ");
		result.append(multipleOperationsSupported);
		result.append(", AuthenticationMechanismsSupported: ");
		result.append(authenticationMechanismsSupported);
		result.append(", AuthenticationMechanismDescriptions: ");
		result.append(authenticationMechanismDescriptions);
		result.append(", Version: ");
		result.append(version);
		result.append(", AdvertiseTypes: ");
		result.append(advertiseTypes);
		result.append(", AdvertiseTypeDescriptions: ");
		result.append(advertiseTypeDescriptions);
		result.append(')');
		return result.toString();
	}

} //CIM_ObjectManagerCommunicationMechanismImpl
