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

import org.dmtf.cim.CIM_NetworkPortSettings;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Network Port Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPortSettingsImpl#getNetworkIDs <em>Network IDs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPortSettingsImpl#getLinkTechnology <em>Link Technology</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NetworkPortSettingsImpl extends CIM_LogicalPortSettingsImpl implements CIM_NetworkPortSettings {
	/**
	 * The cached value of the '{@link #getNetworkIDs() <em>Network IDs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkIDs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> networkIDs;

	/**
	 * The default value of the '{@link #getLinkTechnology() <em>Link Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LINK_TECHNOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkTechnology() <em>Link Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTechnology()
	 * @generated
	 * @ordered
	 */
	protected Integer linkTechnology = LINK_TECHNOLOGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NetworkPortSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NetworkPortSettings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNetworkIDs() {
		if (networkIDs == null) {
			networkIDs = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_NETWORK_PORT_SETTINGS__NETWORK_IDS);
		}
		return networkIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLinkTechnology() {
		return linkTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkTechnology(Integer newLinkTechnology) {
		Integer oldLinkTechnology = linkTechnology;
		linkTechnology = newLinkTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_PORT_SETTINGS__LINK_TECHNOLOGY, oldLinkTechnology, linkTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NETWORK_PORT_SETTINGS__NETWORK_IDS:
				return getNetworkIDs();
			case CimPackage.CIM_NETWORK_PORT_SETTINGS__LINK_TECHNOLOGY:
				return getLinkTechnology();
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
			case CimPackage.CIM_NETWORK_PORT_SETTINGS__NETWORK_IDS:
				getNetworkIDs().clear();
				getNetworkIDs().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_NETWORK_PORT_SETTINGS__LINK_TECHNOLOGY:
				setLinkTechnology((Integer)newValue);
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
			case CimPackage.CIM_NETWORK_PORT_SETTINGS__NETWORK_IDS:
				getNetworkIDs().clear();
				return;
			case CimPackage.CIM_NETWORK_PORT_SETTINGS__LINK_TECHNOLOGY:
				setLinkTechnology(LINK_TECHNOLOGY_EDEFAULT);
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
			case CimPackage.CIM_NETWORK_PORT_SETTINGS__NETWORK_IDS:
				return networkIDs != null && !networkIDs.isEmpty();
			case CimPackage.CIM_NETWORK_PORT_SETTINGS__LINK_TECHNOLOGY:
				return LINK_TECHNOLOGY_EDEFAULT == null ? linkTechnology != null : !LINK_TECHNOLOGY_EDEFAULT.equals(linkTechnology);
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
		result.append(" (NetworkIDs: ");
		result.append(networkIDs);
		result.append(", LinkTechnology: ");
		result.append(linkTechnology);
		result.append(')');
		return result.toString();
	}

} //CIM_NetworkPortSettingsImpl
