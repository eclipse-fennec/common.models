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

import org.dmtf.cim.CIM_PrintService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Print Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintServiceImpl#getPaperTypesAvailable <em>Paper Types Available</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintServiceImpl#getLanguagesSupported <em>Languages Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintServiceImpl#getMimeTypesSupported <em>Mime Types Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintServiceImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintServiceImpl#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintServiceImpl#getAvailableFilters <em>Available Filters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PrintServiceImpl extends CIM_ServiceImpl implements CIM_PrintService {
	/**
	 * The cached value of the '{@link #getPaperTypesAvailable() <em>Paper Types Available</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaperTypesAvailable()
	 * @generated
	 * @ordered
	 */
	protected EList<String> paperTypesAvailable;

	/**
	 * The cached value of the '{@link #getLanguagesSupported() <em>Languages Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguagesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> languagesSupported;

	/**
	 * The cached value of the '{@link #getMimeTypesSupported() <em>Mime Types Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeTypesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mimeTypesSupported;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> capabilities;

	/**
	 * The cached value of the '{@link #getCapabilityDescriptions() <em>Capability Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> capabilityDescriptions;

	/**
	 * The cached value of the '{@link #getAvailableFilters() <em>Available Filters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> availableFilters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PrintServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PrintService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPaperTypesAvailable() {
		if (paperTypesAvailable == null) {
			paperTypesAvailable = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PRINT_SERVICE__PAPER_TYPES_AVAILABLE);
		}
		return paperTypesAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getLanguagesSupported() {
		if (languagesSupported == null) {
			languagesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PRINT_SERVICE__LANGUAGES_SUPPORTED);
		}
		return languagesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMimeTypesSupported() {
		if (mimeTypesSupported == null) {
			mimeTypesSupported = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PRINT_SERVICE__MIME_TYPES_SUPPORTED);
		}
		return mimeTypesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PRINT_SERVICE__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCapabilityDescriptions() {
		if (capabilityDescriptions == null) {
			capabilityDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PRINT_SERVICE__CAPABILITY_DESCRIPTIONS);
		}
		return capabilityDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAvailableFilters() {
		if (availableFilters == null) {
			availableFilters = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PRINT_SERVICE__AVAILABLE_FILTERS);
		}
		return availableFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PRINT_SERVICE__PAPER_TYPES_AVAILABLE:
				return getPaperTypesAvailable();
			case CimPackage.CIM_PRINT_SERVICE__LANGUAGES_SUPPORTED:
				return getLanguagesSupported();
			case CimPackage.CIM_PRINT_SERVICE__MIME_TYPES_SUPPORTED:
				return getMimeTypesSupported();
			case CimPackage.CIM_PRINT_SERVICE__CAPABILITIES:
				return getCapabilities();
			case CimPackage.CIM_PRINT_SERVICE__CAPABILITY_DESCRIPTIONS:
				return getCapabilityDescriptions();
			case CimPackage.CIM_PRINT_SERVICE__AVAILABLE_FILTERS:
				return getAvailableFilters();
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
			case CimPackage.CIM_PRINT_SERVICE__PAPER_TYPES_AVAILABLE:
				getPaperTypesAvailable().clear();
				getPaperTypesAvailable().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PRINT_SERVICE__LANGUAGES_SUPPORTED:
				getLanguagesSupported().clear();
				getLanguagesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PRINT_SERVICE__MIME_TYPES_SUPPORTED:
				getMimeTypesSupported().clear();
				getMimeTypesSupported().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PRINT_SERVICE__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PRINT_SERVICE__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				getCapabilityDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PRINT_SERVICE__AVAILABLE_FILTERS:
				getAvailableFilters().clear();
				getAvailableFilters().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_PRINT_SERVICE__PAPER_TYPES_AVAILABLE:
				getPaperTypesAvailable().clear();
				return;
			case CimPackage.CIM_PRINT_SERVICE__LANGUAGES_SUPPORTED:
				getLanguagesSupported().clear();
				return;
			case CimPackage.CIM_PRINT_SERVICE__MIME_TYPES_SUPPORTED:
				getMimeTypesSupported().clear();
				return;
			case CimPackage.CIM_PRINT_SERVICE__CAPABILITIES:
				getCapabilities().clear();
				return;
			case CimPackage.CIM_PRINT_SERVICE__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				return;
			case CimPackage.CIM_PRINT_SERVICE__AVAILABLE_FILTERS:
				getAvailableFilters().clear();
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
			case CimPackage.CIM_PRINT_SERVICE__PAPER_TYPES_AVAILABLE:
				return paperTypesAvailable != null && !paperTypesAvailable.isEmpty();
			case CimPackage.CIM_PRINT_SERVICE__LANGUAGES_SUPPORTED:
				return languagesSupported != null && !languagesSupported.isEmpty();
			case CimPackage.CIM_PRINT_SERVICE__MIME_TYPES_SUPPORTED:
				return mimeTypesSupported != null && !mimeTypesSupported.isEmpty();
			case CimPackage.CIM_PRINT_SERVICE__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case CimPackage.CIM_PRINT_SERVICE__CAPABILITY_DESCRIPTIONS:
				return capabilityDescriptions != null && !capabilityDescriptions.isEmpty();
			case CimPackage.CIM_PRINT_SERVICE__AVAILABLE_FILTERS:
				return availableFilters != null && !availableFilters.isEmpty();
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
		result.append(" (PaperTypesAvailable: ");
		result.append(paperTypesAvailable);
		result.append(", LanguagesSupported: ");
		result.append(languagesSupported);
		result.append(", MimeTypesSupported: ");
		result.append(mimeTypesSupported);
		result.append(", Capabilities: ");
		result.append(capabilities);
		result.append(", CapabilityDescriptions: ");
		result.append(capabilityDescriptions);
		result.append(", AvailableFilters: ");
		result.append(availableFilters);
		result.append(')');
		return result.toString();
	}

} //CIM_PrintServiceImpl
