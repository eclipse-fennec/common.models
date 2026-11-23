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

import org.dmtf.cim.CIM_SettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SettingDataImpl#getChangeableType <em>Changeable Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SettingDataImpl#getConfigurationName <em>Configuration Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SettingDataImpl#getComponentSetting <em>Component Setting</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SettingDataImpl#getSoID <em>So ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SettingDataImpl#getSoOrgID <em>So Org ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_SettingDataImpl extends CIM_ManagedElementImpl implements CIM_SettingData {
	/**
	 * The default value of the '{@link #getChangeableType() <em>Changeable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHANGEABLE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeableType() <em>Changeable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableType()
	 * @generated
	 * @ordered
	 */
	protected Integer changeableType = CHANGEABLE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigurationName() <em>Configuration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigurationName() <em>Configuration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationName()
	 * @generated
	 * @ordered
	 */
	protected String configurationName = CONFIGURATION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponentSetting() <em>Component Setting</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentSetting()
	 * @generated
	 * @ordered
	 */
	protected EList<String> componentSetting;

	/**
	 * The default value of the '{@link #getSoID() <em>So ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoID()
	 * @generated
	 * @ordered
	 */
	protected static final String SO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoID() <em>So ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoID()
	 * @generated
	 * @ordered
	 */
	protected String soID = SO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoOrgID() <em>So Org ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoOrgID()
	 * @generated
	 * @ordered
	 */
	protected static final String SO_ORG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoOrgID() <em>So Org ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoOrgID()
	 * @generated
	 * @ordered
	 */
	protected String soOrgID = SO_ORG_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getChangeableType() {
		return changeableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeableType(Integer newChangeableType) {
		Integer oldChangeableType = changeableType;
		changeableType = newChangeableType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SETTING_DATA__CHANGEABLE_TYPE, oldChangeableType, changeableType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigurationName() {
		return configurationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigurationName(String newConfigurationName) {
		String oldConfigurationName = configurationName;
		configurationName = newConfigurationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SETTING_DATA__CONFIGURATION_NAME, oldConfigurationName, configurationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getComponentSetting() {
		if (componentSetting == null) {
			componentSetting = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SETTING_DATA__COMPONENT_SETTING);
		}
		return componentSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSoID() {
		return soID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoID(String newSoID) {
		String oldSoID = soID;
		soID = newSoID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SETTING_DATA__SO_ID, oldSoID, soID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSoOrgID() {
		return soOrgID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoOrgID(String newSoOrgID) {
		String oldSoOrgID = soOrgID;
		soOrgID = newSoOrgID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SETTING_DATA__SO_ORG_ID, oldSoOrgID, soOrgID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SETTING_DATA__CHANGEABLE_TYPE:
				return getChangeableType();
			case CimPackage.CIM_SETTING_DATA__CONFIGURATION_NAME:
				return getConfigurationName();
			case CimPackage.CIM_SETTING_DATA__COMPONENT_SETTING:
				return getComponentSetting();
			case CimPackage.CIM_SETTING_DATA__SO_ID:
				return getSoID();
			case CimPackage.CIM_SETTING_DATA__SO_ORG_ID:
				return getSoOrgID();
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
			case CimPackage.CIM_SETTING_DATA__CHANGEABLE_TYPE:
				setChangeableType((Integer)newValue);
				return;
			case CimPackage.CIM_SETTING_DATA__CONFIGURATION_NAME:
				setConfigurationName((String)newValue);
				return;
			case CimPackage.CIM_SETTING_DATA__COMPONENT_SETTING:
				getComponentSetting().clear();
				getComponentSetting().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SETTING_DATA__SO_ID:
				setSoID((String)newValue);
				return;
			case CimPackage.CIM_SETTING_DATA__SO_ORG_ID:
				setSoOrgID((String)newValue);
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
			case CimPackage.CIM_SETTING_DATA__CHANGEABLE_TYPE:
				setChangeableType(CHANGEABLE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_SETTING_DATA__CONFIGURATION_NAME:
				setConfigurationName(CONFIGURATION_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SETTING_DATA__COMPONENT_SETTING:
				getComponentSetting().clear();
				return;
			case CimPackage.CIM_SETTING_DATA__SO_ID:
				setSoID(SO_ID_EDEFAULT);
				return;
			case CimPackage.CIM_SETTING_DATA__SO_ORG_ID:
				setSoOrgID(SO_ORG_ID_EDEFAULT);
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
			case CimPackage.CIM_SETTING_DATA__CHANGEABLE_TYPE:
				return CHANGEABLE_TYPE_EDEFAULT == null ? changeableType != null : !CHANGEABLE_TYPE_EDEFAULT.equals(changeableType);
			case CimPackage.CIM_SETTING_DATA__CONFIGURATION_NAME:
				return CONFIGURATION_NAME_EDEFAULT == null ? configurationName != null : !CONFIGURATION_NAME_EDEFAULT.equals(configurationName);
			case CimPackage.CIM_SETTING_DATA__COMPONENT_SETTING:
				return componentSetting != null && !componentSetting.isEmpty();
			case CimPackage.CIM_SETTING_DATA__SO_ID:
				return SO_ID_EDEFAULT == null ? soID != null : !SO_ID_EDEFAULT.equals(soID);
			case CimPackage.CIM_SETTING_DATA__SO_ORG_ID:
				return SO_ORG_ID_EDEFAULT == null ? soOrgID != null : !SO_ORG_ID_EDEFAULT.equals(soOrgID);
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
		result.append(" (ChangeableType: ");
		result.append(changeableType);
		result.append(", ConfigurationName: ");
		result.append(configurationName);
		result.append(", ComponentSetting: ");
		result.append(componentSetting);
		result.append(", SoID: ");
		result.append(soID);
		result.append(", SoOrgID: ");
		result.append(soOrgID);
		result.append(')');
		return result.toString();
	}

} //CIM_SettingDataImpl
