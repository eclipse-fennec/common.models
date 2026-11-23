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

import org.dmtf.cim.CIM_BIOSElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM BIOS Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSElementImpl#getPrimaryBIOS <em>Primary BIOS</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSElementImpl#getListOfLanguages <em>List Of Languages</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSElementImpl#getCurrentLanguage <em>Current Language</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSElementImpl#getLoadedStartingAddress <em>Loaded Starting Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSElementImpl#getLoadedEndingAddress <em>Loaded Ending Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSElementImpl#getLoadUtilityInformation <em>Load Utility Information</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSElementImpl#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSElementImpl#getRegistryURIs <em>Registry UR Is</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BIOSElementImpl extends CIM_SoftwareElementImpl implements CIM_BIOSElement {
	/**
	 * The default value of the '{@link #getPrimaryBIOS() <em>Primary BIOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryBIOS()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PRIMARY_BIOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryBIOS() <em>Primary BIOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryBIOS()
	 * @generated
	 * @ordered
	 */
	protected Boolean primaryBIOS = PRIMARY_BIOS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListOfLanguages() <em>List Of Languages</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListOfLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<String> listOfLanguages;

	/**
	 * The default value of the '{@link #getCurrentLanguage() <em>Current Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentLanguage() <em>Current Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLanguage()
	 * @generated
	 * @ordered
	 */
	protected String currentLanguage = CURRENT_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadedStartingAddress() <em>Loaded Starting Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadedStartingAddress()
	 * @generated
	 * @ordered
	 */
	protected static final Long LOADED_STARTING_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadedStartingAddress() <em>Loaded Starting Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadedStartingAddress()
	 * @generated
	 * @ordered
	 */
	protected Long loadedStartingAddress = LOADED_STARTING_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadedEndingAddress() <em>Loaded Ending Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadedEndingAddress()
	 * @generated
	 * @ordered
	 */
	protected static final Long LOADED_ENDING_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadedEndingAddress() <em>Loaded Ending Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadedEndingAddress()
	 * @generated
	 * @ordered
	 */
	protected Long loadedEndingAddress = LOADED_ENDING_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadUtilityInformation() <em>Load Utility Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadUtilityInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOAD_UTILITY_INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadUtilityInformation() <em>Load Utility Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadUtilityInformation()
	 * @generated
	 * @ordered
	 */
	protected String loadUtilityInformation = LOAD_UTILITY_INFORMATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEASE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected String releaseDate = RELEASE_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegistryURIs() <em>Registry UR Is</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryURIs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> registryURIs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BIOSElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BIOSElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPrimaryBIOS() {
		return primaryBIOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryBIOS(Boolean newPrimaryBIOS) {
		Boolean oldPrimaryBIOS = primaryBIOS;
		primaryBIOS = newPrimaryBIOS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOS_ELEMENT__PRIMARY_BIOS, oldPrimaryBIOS, primaryBIOS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getListOfLanguages() {
		if (listOfLanguages == null) {
			listOfLanguages = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_BIOS_ELEMENT__LIST_OF_LANGUAGES);
		}
		return listOfLanguages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrentLanguage() {
		return currentLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentLanguage(String newCurrentLanguage) {
		String oldCurrentLanguage = currentLanguage;
		currentLanguage = newCurrentLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOS_ELEMENT__CURRENT_LANGUAGE, oldCurrentLanguage, currentLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLoadedStartingAddress() {
		return loadedStartingAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadedStartingAddress(Long newLoadedStartingAddress) {
		Long oldLoadedStartingAddress = loadedStartingAddress;
		loadedStartingAddress = newLoadedStartingAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOS_ELEMENT__LOADED_STARTING_ADDRESS, oldLoadedStartingAddress, loadedStartingAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLoadedEndingAddress() {
		return loadedEndingAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadedEndingAddress(Long newLoadedEndingAddress) {
		Long oldLoadedEndingAddress = loadedEndingAddress;
		loadedEndingAddress = newLoadedEndingAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOS_ELEMENT__LOADED_ENDING_ADDRESS, oldLoadedEndingAddress, loadedEndingAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoadUtilityInformation() {
		return loadUtilityInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadUtilityInformation(String newLoadUtilityInformation) {
		String oldLoadUtilityInformation = loadUtilityInformation;
		loadUtilityInformation = newLoadUtilityInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOS_ELEMENT__LOAD_UTILITY_INFORMATION, oldLoadUtilityInformation, loadUtilityInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReleaseDate() {
		return releaseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReleaseDate(String newReleaseDate) {
		String oldReleaseDate = releaseDate;
		releaseDate = newReleaseDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOS_ELEMENT__RELEASE_DATE, oldReleaseDate, releaseDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRegistryURIs() {
		if (registryURIs == null) {
			registryURIs = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_BIOS_ELEMENT__REGISTRY_UR_IS);
		}
		return registryURIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BIOS_ELEMENT__PRIMARY_BIOS:
				return getPrimaryBIOS();
			case CimPackage.CIM_BIOS_ELEMENT__LIST_OF_LANGUAGES:
				return getListOfLanguages();
			case CimPackage.CIM_BIOS_ELEMENT__CURRENT_LANGUAGE:
				return getCurrentLanguage();
			case CimPackage.CIM_BIOS_ELEMENT__LOADED_STARTING_ADDRESS:
				return getLoadedStartingAddress();
			case CimPackage.CIM_BIOS_ELEMENT__LOADED_ENDING_ADDRESS:
				return getLoadedEndingAddress();
			case CimPackage.CIM_BIOS_ELEMENT__LOAD_UTILITY_INFORMATION:
				return getLoadUtilityInformation();
			case CimPackage.CIM_BIOS_ELEMENT__RELEASE_DATE:
				return getReleaseDate();
			case CimPackage.CIM_BIOS_ELEMENT__REGISTRY_UR_IS:
				return getRegistryURIs();
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
			case CimPackage.CIM_BIOS_ELEMENT__PRIMARY_BIOS:
				setPrimaryBIOS((Boolean)newValue);
				return;
			case CimPackage.CIM_BIOS_ELEMENT__LIST_OF_LANGUAGES:
				getListOfLanguages().clear();
				getListOfLanguages().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_BIOS_ELEMENT__CURRENT_LANGUAGE:
				setCurrentLanguage((String)newValue);
				return;
			case CimPackage.CIM_BIOS_ELEMENT__LOADED_STARTING_ADDRESS:
				setLoadedStartingAddress((Long)newValue);
				return;
			case CimPackage.CIM_BIOS_ELEMENT__LOADED_ENDING_ADDRESS:
				setLoadedEndingAddress((Long)newValue);
				return;
			case CimPackage.CIM_BIOS_ELEMENT__LOAD_UTILITY_INFORMATION:
				setLoadUtilityInformation((String)newValue);
				return;
			case CimPackage.CIM_BIOS_ELEMENT__RELEASE_DATE:
				setReleaseDate((String)newValue);
				return;
			case CimPackage.CIM_BIOS_ELEMENT__REGISTRY_UR_IS:
				getRegistryURIs().clear();
				getRegistryURIs().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_BIOS_ELEMENT__PRIMARY_BIOS:
				setPrimaryBIOS(PRIMARY_BIOS_EDEFAULT);
				return;
			case CimPackage.CIM_BIOS_ELEMENT__LIST_OF_LANGUAGES:
				getListOfLanguages().clear();
				return;
			case CimPackage.CIM_BIOS_ELEMENT__CURRENT_LANGUAGE:
				setCurrentLanguage(CURRENT_LANGUAGE_EDEFAULT);
				return;
			case CimPackage.CIM_BIOS_ELEMENT__LOADED_STARTING_ADDRESS:
				setLoadedStartingAddress(LOADED_STARTING_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_BIOS_ELEMENT__LOADED_ENDING_ADDRESS:
				setLoadedEndingAddress(LOADED_ENDING_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_BIOS_ELEMENT__LOAD_UTILITY_INFORMATION:
				setLoadUtilityInformation(LOAD_UTILITY_INFORMATION_EDEFAULT);
				return;
			case CimPackage.CIM_BIOS_ELEMENT__RELEASE_DATE:
				setReleaseDate(RELEASE_DATE_EDEFAULT);
				return;
			case CimPackage.CIM_BIOS_ELEMENT__REGISTRY_UR_IS:
				getRegistryURIs().clear();
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
			case CimPackage.CIM_BIOS_ELEMENT__PRIMARY_BIOS:
				return PRIMARY_BIOS_EDEFAULT == null ? primaryBIOS != null : !PRIMARY_BIOS_EDEFAULT.equals(primaryBIOS);
			case CimPackage.CIM_BIOS_ELEMENT__LIST_OF_LANGUAGES:
				return listOfLanguages != null && !listOfLanguages.isEmpty();
			case CimPackage.CIM_BIOS_ELEMENT__CURRENT_LANGUAGE:
				return CURRENT_LANGUAGE_EDEFAULT == null ? currentLanguage != null : !CURRENT_LANGUAGE_EDEFAULT.equals(currentLanguage);
			case CimPackage.CIM_BIOS_ELEMENT__LOADED_STARTING_ADDRESS:
				return LOADED_STARTING_ADDRESS_EDEFAULT == null ? loadedStartingAddress != null : !LOADED_STARTING_ADDRESS_EDEFAULT.equals(loadedStartingAddress);
			case CimPackage.CIM_BIOS_ELEMENT__LOADED_ENDING_ADDRESS:
				return LOADED_ENDING_ADDRESS_EDEFAULT == null ? loadedEndingAddress != null : !LOADED_ENDING_ADDRESS_EDEFAULT.equals(loadedEndingAddress);
			case CimPackage.CIM_BIOS_ELEMENT__LOAD_UTILITY_INFORMATION:
				return LOAD_UTILITY_INFORMATION_EDEFAULT == null ? loadUtilityInformation != null : !LOAD_UTILITY_INFORMATION_EDEFAULT.equals(loadUtilityInformation);
			case CimPackage.CIM_BIOS_ELEMENT__RELEASE_DATE:
				return RELEASE_DATE_EDEFAULT == null ? releaseDate != null : !RELEASE_DATE_EDEFAULT.equals(releaseDate);
			case CimPackage.CIM_BIOS_ELEMENT__REGISTRY_UR_IS:
				return registryURIs != null && !registryURIs.isEmpty();
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
		result.append(" (PrimaryBIOS: ");
		result.append(primaryBIOS);
		result.append(", ListOfLanguages: ");
		result.append(listOfLanguages);
		result.append(", CurrentLanguage: ");
		result.append(currentLanguage);
		result.append(", LoadedStartingAddress: ");
		result.append(loadedStartingAddress);
		result.append(", LoadedEndingAddress: ");
		result.append(loadedEndingAddress);
		result.append(", LoadUtilityInformation: ");
		result.append(loadUtilityInformation);
		result.append(", ReleaseDate: ");
		result.append(releaseDate);
		result.append(", RegistryURIs: ");
		result.append(registryURIs);
		result.append(')');
		return result.toString();
	}

} //CIM_BIOSElementImpl
