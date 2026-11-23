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

import org.dmtf.cim.CIM_WiFiNetworkDetectionSettings;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Wi Fi Network Detection Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiNetworkDetectionSettingsImpl#getTargetNetworkCategories <em>Target Network Categories</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiNetworkDetectionSettingsImpl#getPreferredNetworks <em>Preferred Networks</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiNetworkDetectionSettingsImpl#getKnownNetworks <em>Known Networks</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiNetworkDetectionSettingsImpl#getMinimumSignalStrength <em>Minimum Signal Strength</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiNetworkDetectionSettingsImpl#getPortTypes <em>Port Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_WiFiNetworkDetectionSettingsImpl extends CIM_SettingDataImpl implements CIM_WiFiNetworkDetectionSettings {
	/**
	 * The default value of the '{@link #getTargetNetworkCategories() <em>Target Network Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNetworkCategories()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_NETWORK_CATEGORIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNetworkCategories() <em>Target Network Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNetworkCategories()
	 * @generated
	 * @ordered
	 */
	protected Integer targetNetworkCategories = TARGET_NETWORK_CATEGORIES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPreferredNetworks() <em>Preferred Networks</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<String> preferredNetworks;

	/**
	 * The cached value of the '{@link #getKnownNetworks() <em>Known Networks</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnownNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<String> knownNetworks;

	/**
	 * The default value of the '{@link #getMinimumSignalStrength() <em>Minimum Signal Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSignalStrength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MINIMUM_SIGNAL_STRENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumSignalStrength() <em>Minimum Signal Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSignalStrength()
	 * @generated
	 * @ordered
	 */
	protected Integer minimumSignalStrength = MINIMUM_SIGNAL_STRENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPortTypes() <em>Port Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> portTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_WiFiNetworkDetectionSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_WiFiNetworkDetectionSettings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTargetNetworkCategories() {
		return targetNetworkCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetNetworkCategories(Integer newTargetNetworkCategories) {
		Integer oldTargetNetworkCategories = targetNetworkCategories;
		targetNetworkCategories = newTargetNetworkCategories;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__TARGET_NETWORK_CATEGORIES, oldTargetNetworkCategories, targetNetworkCategories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPreferredNetworks() {
		if (preferredNetworks == null) {
			preferredNetworks = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__PREFERRED_NETWORKS);
		}
		return preferredNetworks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getKnownNetworks() {
		if (knownNetworks == null) {
			knownNetworks = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__KNOWN_NETWORKS);
		}
		return knownNetworks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinimumSignalStrength() {
		return minimumSignalStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumSignalStrength(Integer newMinimumSignalStrength) {
		Integer oldMinimumSignalStrength = minimumSignalStrength;
		minimumSignalStrength = newMinimumSignalStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__MINIMUM_SIGNAL_STRENGTH, oldMinimumSignalStrength, minimumSignalStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPortTypes() {
		if (portTypes == null) {
			portTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__PORT_TYPES);
		}
		return portTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__TARGET_NETWORK_CATEGORIES:
				return getTargetNetworkCategories();
			case CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__PREFERRED_NETWORKS:
				return getPreferredNetworks();
			case CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__KNOWN_NETWORKS:
				return getKnownNetworks();
			case CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__MINIMUM_SIGNAL_STRENGTH:
				return getMinimumSignalStrength();
			case CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__PORT_TYPES:
				return getPortTypes();
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
			case CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__TARGET_NETWORK_CATEGORIES:
				setTargetNetworkCategories((Integer)newValue);
				return;
			case CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__PREFERRED_NETWORKS:
				getPreferredNetworks().clear();
				getPreferredNetworks().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__KNOWN_NETWORKS:
				getKnownNetworks().clear();
				getKnownNetworks().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__MINIMUM_SIGNAL_STRENGTH:
				setMinimumSignalStrength((Integer)newValue);
				return;
			case CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__PORT_TYPES:
				getPortTypes().clear();
				getPortTypes().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__TARGET_NETWORK_CATEGORIES:
				setTargetNetworkCategories(TARGET_NETWORK_CATEGORIES_EDEFAULT);
				return;
			case CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__PREFERRED_NETWORKS:
				getPreferredNetworks().clear();
				return;
			case CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__KNOWN_NETWORKS:
				getKnownNetworks().clear();
				return;
			case CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__MINIMUM_SIGNAL_STRENGTH:
				setMinimumSignalStrength(MINIMUM_SIGNAL_STRENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__PORT_TYPES:
				getPortTypes().clear();
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
			case CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__TARGET_NETWORK_CATEGORIES:
				return TARGET_NETWORK_CATEGORIES_EDEFAULT == null ? targetNetworkCategories != null : !TARGET_NETWORK_CATEGORIES_EDEFAULT.equals(targetNetworkCategories);
			case CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__PREFERRED_NETWORKS:
				return preferredNetworks != null && !preferredNetworks.isEmpty();
			case CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__KNOWN_NETWORKS:
				return knownNetworks != null && !knownNetworks.isEmpty();
			case CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__MINIMUM_SIGNAL_STRENGTH:
				return MINIMUM_SIGNAL_STRENGTH_EDEFAULT == null ? minimumSignalStrength != null : !MINIMUM_SIGNAL_STRENGTH_EDEFAULT.equals(minimumSignalStrength);
			case CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS__PORT_TYPES:
				return portTypes != null && !portTypes.isEmpty();
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
		result.append(" (TargetNetworkCategories: ");
		result.append(targetNetworkCategories);
		result.append(", PreferredNetworks: ");
		result.append(preferredNetworks);
		result.append(", KnownNetworks: ");
		result.append(knownNetworks);
		result.append(", MinimumSignalStrength: ");
		result.append(minimumSignalStrength);
		result.append(", PortTypes: ");
		result.append(portTypes);
		result.append(')');
		return result.toString();
	}

} //CIM_WiFiNetworkDetectionSettingsImpl
