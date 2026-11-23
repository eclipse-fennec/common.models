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

import org.dmtf.cim.CIM_Namespace;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NamespaceImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NamespaceImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NamespaceImpl#getObjectManagerCreationClassName <em>Object Manager Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NamespaceImpl#getObjectManagerName <em>Object Manager Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NamespaceImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NamespaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NamespaceImpl#getClassInfo <em>Class Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NamespaceImpl#getDescriptionOfClassInfo <em>Description Of Class Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NamespaceImpl#getClassType <em>Class Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NamespaceImpl#getClassTypeVersion <em>Class Type Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NamespaceImpl#getDescriptionOfClassType <em>Description Of Class Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NamespaceImpl extends CIM_ManagedElementImpl implements CIM_Namespace {
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
	 * The default value of the '{@link #getClassInfo() <em>Class Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassInfo()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CLASS_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassInfo() <em>Class Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassInfo()
	 * @generated
	 * @ordered
	 */
	protected Integer classInfo = CLASS_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptionOfClassInfo() <em>Description Of Class Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionOfClassInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_OF_CLASS_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionOfClassInfo() <em>Description Of Class Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionOfClassInfo()
	 * @generated
	 * @ordered
	 */
	protected String descriptionOfClassInfo = DESCRIPTION_OF_CLASS_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassType() <em>Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CLASS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassType() <em>Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassType()
	 * @generated
	 * @ordered
	 */
	protected Integer classType = CLASS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassTypeVersion() <em>Class Type Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassTypeVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_TYPE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassTypeVersion() <em>Class Type Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassTypeVersion()
	 * @generated
	 * @ordered
	 */
	protected String classTypeVersion = CLASS_TYPE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptionOfClassType() <em>Description Of Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionOfClassType()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_OF_CLASS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionOfClassType() <em>Description Of Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionOfClassType()
	 * @generated
	 * @ordered
	 */
	protected String descriptionOfClassType = DESCRIPTION_OF_CLASS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Namespace();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NAMESPACE__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NAMESPACE__SYSTEM_NAME, oldSystemName, systemName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NAMESPACE__OBJECT_MANAGER_CREATION_CLASS_NAME, oldObjectManagerCreationClassName, objectManagerCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NAMESPACE__OBJECT_MANAGER_NAME, oldObjectManagerName, objectManagerName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NAMESPACE__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NAMESPACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getClassInfo() {
		return classInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassInfo(Integer newClassInfo) {
		Integer oldClassInfo = classInfo;
		classInfo = newClassInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NAMESPACE__CLASS_INFO, oldClassInfo, classInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescriptionOfClassInfo() {
		return descriptionOfClassInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescriptionOfClassInfo(String newDescriptionOfClassInfo) {
		String oldDescriptionOfClassInfo = descriptionOfClassInfo;
		descriptionOfClassInfo = newDescriptionOfClassInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NAMESPACE__DESCRIPTION_OF_CLASS_INFO, oldDescriptionOfClassInfo, descriptionOfClassInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getClassType() {
		return classType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassType(Integer newClassType) {
		Integer oldClassType = classType;
		classType = newClassType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NAMESPACE__CLASS_TYPE, oldClassType, classType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassTypeVersion() {
		return classTypeVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassTypeVersion(String newClassTypeVersion) {
		String oldClassTypeVersion = classTypeVersion;
		classTypeVersion = newClassTypeVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NAMESPACE__CLASS_TYPE_VERSION, oldClassTypeVersion, classTypeVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescriptionOfClassType() {
		return descriptionOfClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescriptionOfClassType(String newDescriptionOfClassType) {
		String oldDescriptionOfClassType = descriptionOfClassType;
		descriptionOfClassType = newDescriptionOfClassType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NAMESPACE__DESCRIPTION_OF_CLASS_TYPE, oldDescriptionOfClassType, descriptionOfClassType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NAMESPACE__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_NAMESPACE__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_NAMESPACE__OBJECT_MANAGER_CREATION_CLASS_NAME:
				return getObjectManagerCreationClassName();
			case CimPackage.CIM_NAMESPACE__OBJECT_MANAGER_NAME:
				return getObjectManagerName();
			case CimPackage.CIM_NAMESPACE__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_NAMESPACE__NAME:
				return getName();
			case CimPackage.CIM_NAMESPACE__CLASS_INFO:
				return getClassInfo();
			case CimPackage.CIM_NAMESPACE__DESCRIPTION_OF_CLASS_INFO:
				return getDescriptionOfClassInfo();
			case CimPackage.CIM_NAMESPACE__CLASS_TYPE:
				return getClassType();
			case CimPackage.CIM_NAMESPACE__CLASS_TYPE_VERSION:
				return getClassTypeVersion();
			case CimPackage.CIM_NAMESPACE__DESCRIPTION_OF_CLASS_TYPE:
				return getDescriptionOfClassType();
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
			case CimPackage.CIM_NAMESPACE__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_NAMESPACE__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_NAMESPACE__OBJECT_MANAGER_CREATION_CLASS_NAME:
				setObjectManagerCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_NAMESPACE__OBJECT_MANAGER_NAME:
				setObjectManagerName((String)newValue);
				return;
			case CimPackage.CIM_NAMESPACE__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_NAMESPACE__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CIM_NAMESPACE__CLASS_INFO:
				setClassInfo((Integer)newValue);
				return;
			case CimPackage.CIM_NAMESPACE__DESCRIPTION_OF_CLASS_INFO:
				setDescriptionOfClassInfo((String)newValue);
				return;
			case CimPackage.CIM_NAMESPACE__CLASS_TYPE:
				setClassType((Integer)newValue);
				return;
			case CimPackage.CIM_NAMESPACE__CLASS_TYPE_VERSION:
				setClassTypeVersion((String)newValue);
				return;
			case CimPackage.CIM_NAMESPACE__DESCRIPTION_OF_CLASS_TYPE:
				setDescriptionOfClassType((String)newValue);
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
			case CimPackage.CIM_NAMESPACE__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_NAMESPACE__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_NAMESPACE__OBJECT_MANAGER_CREATION_CLASS_NAME:
				setObjectManagerCreationClassName(OBJECT_MANAGER_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_NAMESPACE__OBJECT_MANAGER_NAME:
				setObjectManagerName(OBJECT_MANAGER_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_NAMESPACE__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_NAMESPACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CIM_NAMESPACE__CLASS_INFO:
				setClassInfo(CLASS_INFO_EDEFAULT);
				return;
			case CimPackage.CIM_NAMESPACE__DESCRIPTION_OF_CLASS_INFO:
				setDescriptionOfClassInfo(DESCRIPTION_OF_CLASS_INFO_EDEFAULT);
				return;
			case CimPackage.CIM_NAMESPACE__CLASS_TYPE:
				setClassType(CLASS_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_NAMESPACE__CLASS_TYPE_VERSION:
				setClassTypeVersion(CLASS_TYPE_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_NAMESPACE__DESCRIPTION_OF_CLASS_TYPE:
				setDescriptionOfClassType(DESCRIPTION_OF_CLASS_TYPE_EDEFAULT);
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
			case CimPackage.CIM_NAMESPACE__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_NAMESPACE__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_NAMESPACE__OBJECT_MANAGER_CREATION_CLASS_NAME:
				return OBJECT_MANAGER_CREATION_CLASS_NAME_EDEFAULT == null ? objectManagerCreationClassName != null : !OBJECT_MANAGER_CREATION_CLASS_NAME_EDEFAULT.equals(objectManagerCreationClassName);
			case CimPackage.CIM_NAMESPACE__OBJECT_MANAGER_NAME:
				return OBJECT_MANAGER_NAME_EDEFAULT == null ? objectManagerName != null : !OBJECT_MANAGER_NAME_EDEFAULT.equals(objectManagerName);
			case CimPackage.CIM_NAMESPACE__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_NAMESPACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CIM_NAMESPACE__CLASS_INFO:
				return CLASS_INFO_EDEFAULT == null ? classInfo != null : !CLASS_INFO_EDEFAULT.equals(classInfo);
			case CimPackage.CIM_NAMESPACE__DESCRIPTION_OF_CLASS_INFO:
				return DESCRIPTION_OF_CLASS_INFO_EDEFAULT == null ? descriptionOfClassInfo != null : !DESCRIPTION_OF_CLASS_INFO_EDEFAULT.equals(descriptionOfClassInfo);
			case CimPackage.CIM_NAMESPACE__CLASS_TYPE:
				return CLASS_TYPE_EDEFAULT == null ? classType != null : !CLASS_TYPE_EDEFAULT.equals(classType);
			case CimPackage.CIM_NAMESPACE__CLASS_TYPE_VERSION:
				return CLASS_TYPE_VERSION_EDEFAULT == null ? classTypeVersion != null : !CLASS_TYPE_VERSION_EDEFAULT.equals(classTypeVersion);
			case CimPackage.CIM_NAMESPACE__DESCRIPTION_OF_CLASS_TYPE:
				return DESCRIPTION_OF_CLASS_TYPE_EDEFAULT == null ? descriptionOfClassType != null : !DESCRIPTION_OF_CLASS_TYPE_EDEFAULT.equals(descriptionOfClassType);
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
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", Name: ");
		result.append(name);
		result.append(", ClassInfo: ");
		result.append(classInfo);
		result.append(", DescriptionOfClassInfo: ");
		result.append(descriptionOfClassInfo);
		result.append(", ClassType: ");
		result.append(classType);
		result.append(", ClassTypeVersion: ");
		result.append(classTypeVersion);
		result.append(", DescriptionOfClassType: ");
		result.append(descriptionOfClassType);
		result.append(')');
		return result.toString();
	}

} //CIM_NamespaceImpl
