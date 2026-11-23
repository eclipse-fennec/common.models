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

import org.dmtf.cim.CIM_SystemIdentification;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM System Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemIdentificationImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemIdentificationImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemIdentificationImpl#getObjectManagerCreationClassName <em>Object Manager Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemIdentificationImpl#getObjectManagerName <em>Object Manager Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemIdentificationImpl#getNamespaceCreationClassName <em>Namespace Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemIdentificationImpl#getNamespaceName <em>Namespace Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemIdentificationImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemIdentificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemIdentificationImpl#getIdentificationFormats <em>Identification Formats</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemIdentificationImpl#getFormatDescriptions <em>Format Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemIdentificationImpl#getIdentificationData <em>Identification Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SystemIdentificationImpl extends CIM_ManagedElementImpl implements CIM_SystemIdentification {
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
	 * The default value of the '{@link #getObjectManagerCreationClassName() <em>Object Manager Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectManagerCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_MANAGER_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectManagerCreationClassName() <em>Object Manager Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectManagerCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String objectManagerCreationClassName = OBJECT_MANAGER_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectManagerName() <em>Object Manager Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectManagerName()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_MANAGER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectManagerName() <em>Object Manager Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectManagerName()
	 * @generated
	 * @ordered
	 */
	protected String objectManagerName = OBJECT_MANAGER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespaceCreationClassName() <em>Namespace Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespaceCreationClassName() <em>Namespace Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String namespaceCreationClassName = NAMESPACE_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespaceName() <em>Namespace Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespaceName() <em>Namespace Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceName()
	 * @generated
	 * @ordered
	 */
	protected String namespaceName = NAMESPACE_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getIdentificationFormats() <em>Identification Formats</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationFormats()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> identificationFormats;

	/**
	 * The cached value of the '{@link #getFormatDescriptions() <em>Format Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> formatDescriptions;

	/**
	 * The cached value of the '{@link #getIdentificationData() <em>Identification Data</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationData()
	 * @generated
	 * @ordered
	 */
	protected EList<String> identificationData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SystemIdentificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SystemIdentification();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYSTEM_IDENTIFICATION__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYSTEM_IDENTIFICATION__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObjectManagerCreationClassName() {
		return objectManagerCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjectManagerCreationClassName(String newObjectManagerCreationClassName) {
		String oldObjectManagerCreationClassName = objectManagerCreationClassName;
		objectManagerCreationClassName = newObjectManagerCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYSTEM_IDENTIFICATION__OBJECT_MANAGER_CREATION_CLASS_NAME, oldObjectManagerCreationClassName, objectManagerCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObjectManagerName() {
		return objectManagerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjectManagerName(String newObjectManagerName) {
		String oldObjectManagerName = objectManagerName;
		objectManagerName = newObjectManagerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYSTEM_IDENTIFICATION__OBJECT_MANAGER_NAME, oldObjectManagerName, objectManagerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNamespaceCreationClassName() {
		return namespaceCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamespaceCreationClassName(String newNamespaceCreationClassName) {
		String oldNamespaceCreationClassName = namespaceCreationClassName;
		namespaceCreationClassName = newNamespaceCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYSTEM_IDENTIFICATION__NAMESPACE_CREATION_CLASS_NAME, oldNamespaceCreationClassName, namespaceCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNamespaceName() {
		return namespaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamespaceName(String newNamespaceName) {
		String oldNamespaceName = namespaceName;
		namespaceName = newNamespaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYSTEM_IDENTIFICATION__NAMESPACE_NAME, oldNamespaceName, namespaceName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYSTEM_IDENTIFICATION__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYSTEM_IDENTIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getIdentificationFormats() {
		if (identificationFormats == null) {
			identificationFormats = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SYSTEM_IDENTIFICATION__IDENTIFICATION_FORMATS);
		}
		return identificationFormats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getFormatDescriptions() {
		if (formatDescriptions == null) {
			formatDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SYSTEM_IDENTIFICATION__FORMAT_DESCRIPTIONS);
		}
		return formatDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getIdentificationData() {
		if (identificationData == null) {
			identificationData = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SYSTEM_IDENTIFICATION__IDENTIFICATION_DATA);
		}
		return identificationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__OBJECT_MANAGER_CREATION_CLASS_NAME:
				return getObjectManagerCreationClassName();
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__OBJECT_MANAGER_NAME:
				return getObjectManagerName();
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__NAMESPACE_CREATION_CLASS_NAME:
				return getNamespaceCreationClassName();
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__NAMESPACE_NAME:
				return getNamespaceName();
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__NAME:
				return getName();
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__IDENTIFICATION_FORMATS:
				return getIdentificationFormats();
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__FORMAT_DESCRIPTIONS:
				return getFormatDescriptions();
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__IDENTIFICATION_DATA:
				return getIdentificationData();
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
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__OBJECT_MANAGER_CREATION_CLASS_NAME:
				setObjectManagerCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__OBJECT_MANAGER_NAME:
				setObjectManagerName((String)newValue);
				return;
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__NAMESPACE_CREATION_CLASS_NAME:
				setNamespaceCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__NAMESPACE_NAME:
				setNamespaceName((String)newValue);
				return;
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__IDENTIFICATION_FORMATS:
				getIdentificationFormats().clear();
				getIdentificationFormats().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__FORMAT_DESCRIPTIONS:
				getFormatDescriptions().clear();
				getFormatDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__IDENTIFICATION_DATA:
				getIdentificationData().clear();
				getIdentificationData().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__OBJECT_MANAGER_CREATION_CLASS_NAME:
				setObjectManagerCreationClassName(OBJECT_MANAGER_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__OBJECT_MANAGER_NAME:
				setObjectManagerName(OBJECT_MANAGER_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__NAMESPACE_CREATION_CLASS_NAME:
				setNamespaceCreationClassName(NAMESPACE_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__NAMESPACE_NAME:
				setNamespaceName(NAMESPACE_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__IDENTIFICATION_FORMATS:
				getIdentificationFormats().clear();
				return;
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__FORMAT_DESCRIPTIONS:
				getFormatDescriptions().clear();
				return;
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__IDENTIFICATION_DATA:
				getIdentificationData().clear();
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
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__OBJECT_MANAGER_CREATION_CLASS_NAME:
				return OBJECT_MANAGER_CREATION_CLASS_NAME_EDEFAULT == null ? objectManagerCreationClassName != null : !OBJECT_MANAGER_CREATION_CLASS_NAME_EDEFAULT.equals(objectManagerCreationClassName);
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__OBJECT_MANAGER_NAME:
				return OBJECT_MANAGER_NAME_EDEFAULT == null ? objectManagerName != null : !OBJECT_MANAGER_NAME_EDEFAULT.equals(objectManagerName);
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__NAMESPACE_CREATION_CLASS_NAME:
				return NAMESPACE_CREATION_CLASS_NAME_EDEFAULT == null ? namespaceCreationClassName != null : !NAMESPACE_CREATION_CLASS_NAME_EDEFAULT.equals(namespaceCreationClassName);
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__NAMESPACE_NAME:
				return NAMESPACE_NAME_EDEFAULT == null ? namespaceName != null : !NAMESPACE_NAME_EDEFAULT.equals(namespaceName);
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__IDENTIFICATION_FORMATS:
				return identificationFormats != null && !identificationFormats.isEmpty();
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__FORMAT_DESCRIPTIONS:
				return formatDescriptions != null && !formatDescriptions.isEmpty();
			case CimPackage.CIM_SYSTEM_IDENTIFICATION__IDENTIFICATION_DATA:
				return identificationData != null && !identificationData.isEmpty();
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
		result.append(", ObjectManagerCreationClassName: ");
		result.append(objectManagerCreationClassName);
		result.append(", ObjectManagerName: ");
		result.append(objectManagerName);
		result.append(", NamespaceCreationClassName: ");
		result.append(namespaceCreationClassName);
		result.append(", NamespaceName: ");
		result.append(namespaceName);
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", Name: ");
		result.append(name);
		result.append(", IdentificationFormats: ");
		result.append(identificationFormats);
		result.append(", FormatDescriptions: ");
		result.append(formatDescriptions);
		result.append(", IdentificationData: ");
		result.append(identificationData);
		result.append(')');
		return result.toString();
	}

} //CIM_SystemIdentificationImpl
