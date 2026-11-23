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

import org.dmtf.cim.CIM_AccessControlInformation;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Access Control Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccessControlInformationImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccessControlInformationImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccessControlInformationImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccessControlInformationImpl#getSecurityClassification <em>Security Classification</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccessControlInformationImpl#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccessControlInformationImpl#getAccessQualifier <em>Access Qualifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccessControlInformationImpl#getPermission <em>Permission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AccessControlInformationImpl extends CIM_LogicalElementImpl implements CIM_AccessControlInformation {
	/**
	 * The default value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String systemCreationClassName = SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getSecurityClassification() <em>Security Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityClassification()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_CLASSIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityClassification() <em>Security Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityClassification()
	 * @generated
	 * @ordered
	 */
	protected String securityClassification = SECURITY_CLASSIFICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccessType() <em>Access Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected EList<String> accessType;

	/**
	 * The cached value of the '{@link #getAccessQualifier() <em>Access Qualifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<String> accessQualifier;

	/**
	 * The cached value of the '{@link #getPermission() <em>Permission</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected EList<String> permission;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AccessControlInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AccessControlInformation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemCreationClassName() {
		return systemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemCreationClassName(String newSystemCreationClassName) {
		String oldSystemCreationClassName = systemCreationClassName;
		systemCreationClassName = newSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCESS_CONTROL_INFORMATION__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCESS_CONTROL_INFORMATION__SYSTEM_NAME, oldSystemName, systemName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCESS_CONTROL_INFORMATION__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityClassification() {
		return securityClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityClassification(String newSecurityClassification) {
		String oldSecurityClassification = securityClassification;
		securityClassification = newSecurityClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCESS_CONTROL_INFORMATION__SECURITY_CLASSIFICATION, oldSecurityClassification, securityClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAccessType() {
		if (accessType == null) {
			accessType = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ACCESS_CONTROL_INFORMATION__ACCESS_TYPE);
		}
		return accessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAccessQualifier() {
		if (accessQualifier == null) {
			accessQualifier = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ACCESS_CONTROL_INFORMATION__ACCESS_QUALIFIER);
		}
		return accessQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPermission() {
		if (permission == null) {
			permission = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ACCESS_CONTROL_INFORMATION__PERMISSION);
		}
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__SECURITY_CLASSIFICATION:
				return getSecurityClassification();
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__ACCESS_TYPE:
				return getAccessType();
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__ACCESS_QUALIFIER:
				return getAccessQualifier();
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__PERMISSION:
				return getPermission();
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
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__SECURITY_CLASSIFICATION:
				setSecurityClassification((String)newValue);
				return;
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__ACCESS_TYPE:
				getAccessType().clear();
				getAccessType().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__ACCESS_QUALIFIER:
				getAccessQualifier().clear();
				getAccessQualifier().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__PERMISSION:
				getPermission().clear();
				getPermission().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__SECURITY_CLASSIFICATION:
				setSecurityClassification(SECURITY_CLASSIFICATION_EDEFAULT);
				return;
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__ACCESS_TYPE:
				getAccessType().clear();
				return;
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__ACCESS_QUALIFIER:
				getAccessQualifier().clear();
				return;
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__PERMISSION:
				getPermission().clear();
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
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__SECURITY_CLASSIFICATION:
				return SECURITY_CLASSIFICATION_EDEFAULT == null ? securityClassification != null : !SECURITY_CLASSIFICATION_EDEFAULT.equals(securityClassification);
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__ACCESS_TYPE:
				return accessType != null && !accessType.isEmpty();
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__ACCESS_QUALIFIER:
				return accessQualifier != null && !accessQualifier.isEmpty();
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION__PERMISSION:
				return permission != null && !permission.isEmpty();
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
		result.append(" (SystemCreationClassName: ");
		result.append(systemCreationClassName);
		result.append(", SystemName: ");
		result.append(systemName);
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", SecurityClassification: ");
		result.append(securityClassification);
		result.append(", AccessType: ");
		result.append(accessType);
		result.append(", AccessQualifier: ");
		result.append(accessQualifier);
		result.append(", Permission: ");
		result.append(permission);
		result.append(')');
		return result.toString();
	}

} //CIM_AccessControlInformationImpl
