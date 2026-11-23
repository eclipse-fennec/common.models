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

import org.dmtf.cim.CIM_StorageElementCompositionCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Element Composition Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageElementCompositionCapabilitiesImpl#getSupportsComposites <em>Supports Composites</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageElementCompositionCapabilitiesImpl#getMaxCompositeSize <em>Max Composite Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageElementCompositionCapabilitiesImpl#getMaxCompositeElements <em>Max Composite Elements</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageElementCompositionCapabilitiesImpl#getCompositionCharacteristics <em>Composition Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageElementCompositionCapabilitiesImpl#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageElementCompositionCapabilitiesImpl#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageElementCompositionCapabilitiesImpl#getSupportedStorageElements <em>Supported Storage Elements</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageElementCompositionCapabilitiesImpl#getCompositionMethodsSupported <em>Composition Methods Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageElementCompositionCapabilitiesImpl#getCompositeSourcesSupported <em>Composite Sources Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageElementCompositionCapabilitiesImpl#getSupportsCompositeNaming <em>Supports Composite Naming</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageElementCompositionCapabilitiesImpl#getSupportsRepresentativeElement <em>Supports Representative Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageElementCompositionCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_StorageElementCompositionCapabilities {
	/**
	 * The default value of the '{@link #getSupportsComposites() <em>Supports Composites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsComposites()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUPPORTS_COMPOSITES_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getSupportsComposites() <em>Supports Composites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsComposites()
	 * @generated
	 * @ordered
	 */
	protected Boolean supportsComposites = SUPPORTS_COMPOSITES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCompositeSize() <em>Max Composite Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCompositeSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_COMPOSITE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxCompositeSize() <em>Max Composite Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCompositeSize()
	 * @generated
	 * @ordered
	 */
	protected Long maxCompositeSize = MAX_COMPOSITE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCompositeElements() <em>Max Composite Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCompositeElements()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_COMPOSITE_ELEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxCompositeElements() <em>Max Composite Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCompositeElements()
	 * @generated
	 * @ordered
	 */
	protected Long maxCompositeElements = MAX_COMPOSITE_ELEMENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompositionCharacteristics() <em>Composition Characteristics</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositionCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> compositionCharacteristics;

	/**
	 * The cached value of the '{@link #getSupportedAsynchronousActions() <em>Supported Asynchronous Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAsynchronousActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedAsynchronousActions;

	/**
	 * The cached value of the '{@link #getSupportedSynchronousActions() <em>Supported Synchronous Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedSynchronousActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedSynchronousActions;

	/**
	 * The cached value of the '{@link #getSupportedStorageElements() <em>Supported Storage Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedStorageElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedStorageElements;

	/**
	 * The cached value of the '{@link #getCompositionMethodsSupported() <em>Composition Methods Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositionMethodsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> compositionMethodsSupported;

	/**
	 * The cached value of the '{@link #getCompositeSourcesSupported() <em>Composite Sources Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeSourcesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> compositeSourcesSupported;

	/**
	 * The default value of the '{@link #getSupportsCompositeNaming() <em>Supports Composite Naming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsCompositeNaming()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUPPORTS_COMPOSITE_NAMING_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getSupportsCompositeNaming() <em>Supports Composite Naming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsCompositeNaming()
	 * @generated
	 * @ordered
	 */
	protected Boolean supportsCompositeNaming = SUPPORTS_COMPOSITE_NAMING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupportsRepresentativeElement() <em>Supports Representative Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsRepresentativeElement()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUPPORTS_REPRESENTATIVE_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportsRepresentativeElement() <em>Supports Representative Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsRepresentativeElement()
	 * @generated
	 * @ordered
	 */
	protected Boolean supportsRepresentativeElement = SUPPORTS_REPRESENTATIVE_ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageElementCompositionCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageElementCompositionCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSupportsComposites() {
		return supportsComposites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportsComposites(Boolean newSupportsComposites) {
		Boolean oldSupportsComposites = supportsComposites;
		supportsComposites = newSupportsComposites;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTS_COMPOSITES, oldSupportsComposites, supportsComposites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxCompositeSize() {
		return maxCompositeSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxCompositeSize(Long newMaxCompositeSize) {
		Long oldMaxCompositeSize = maxCompositeSize;
		maxCompositeSize = newMaxCompositeSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__MAX_COMPOSITE_SIZE, oldMaxCompositeSize, maxCompositeSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxCompositeElements() {
		return maxCompositeElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxCompositeElements(Long newMaxCompositeElements) {
		Long oldMaxCompositeElements = maxCompositeElements;
		maxCompositeElements = newMaxCompositeElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__MAX_COMPOSITE_ELEMENTS, oldMaxCompositeElements, maxCompositeElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCompositionCharacteristics() {
		if (compositionCharacteristics == null) {
			compositionCharacteristics = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__COMPOSITION_CHARACTERISTICS);
		}
		return compositionCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedAsynchronousActions() {
		if (supportedAsynchronousActions == null) {
			supportedAsynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS);
		}
		return supportedAsynchronousActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedSynchronousActions() {
		if (supportedSynchronousActions == null) {
			supportedSynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS);
		}
		return supportedSynchronousActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedStorageElements() {
		if (supportedStorageElements == null) {
			supportedStorageElements = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENTS);
		}
		return supportedStorageElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCompositionMethodsSupported() {
		if (compositionMethodsSupported == null) {
			compositionMethodsSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__COMPOSITION_METHODS_SUPPORTED);
		}
		return compositionMethodsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCompositeSourcesSupported() {
		if (compositeSourcesSupported == null) {
			compositeSourcesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__COMPOSITE_SOURCES_SUPPORTED);
		}
		return compositeSourcesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSupportsCompositeNaming() {
		return supportsCompositeNaming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportsCompositeNaming(Boolean newSupportsCompositeNaming) {
		Boolean oldSupportsCompositeNaming = supportsCompositeNaming;
		supportsCompositeNaming = newSupportsCompositeNaming;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTS_COMPOSITE_NAMING, oldSupportsCompositeNaming, supportsCompositeNaming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSupportsRepresentativeElement() {
		return supportsRepresentativeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportsRepresentativeElement(Boolean newSupportsRepresentativeElement) {
		Boolean oldSupportsRepresentativeElement = supportsRepresentativeElement;
		supportsRepresentativeElement = newSupportsRepresentativeElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTS_REPRESENTATIVE_ELEMENT, oldSupportsRepresentativeElement, supportsRepresentativeElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTS_COMPOSITES:
				return getSupportsComposites();
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__MAX_COMPOSITE_SIZE:
				return getMaxCompositeSize();
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__MAX_COMPOSITE_ELEMENTS:
				return getMaxCompositeElements();
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__COMPOSITION_CHARACTERISTICS:
				return getCompositionCharacteristics();
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return getSupportedAsynchronousActions();
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return getSupportedSynchronousActions();
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENTS:
				return getSupportedStorageElements();
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__COMPOSITION_METHODS_SUPPORTED:
				return getCompositionMethodsSupported();
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__COMPOSITE_SOURCES_SUPPORTED:
				return getCompositeSourcesSupported();
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTS_COMPOSITE_NAMING:
				return getSupportsCompositeNaming();
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTS_REPRESENTATIVE_ELEMENT:
				return getSupportsRepresentativeElement();
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
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTS_COMPOSITES:
				setSupportsComposites((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__MAX_COMPOSITE_SIZE:
				setMaxCompositeSize((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__MAX_COMPOSITE_ELEMENTS:
				setMaxCompositeElements((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__COMPOSITION_CHARACTERISTICS:
				getCompositionCharacteristics().clear();
				getCompositionCharacteristics().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSupportedAsynchronousActions().clear();
				getSupportedAsynchronousActions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
				getSupportedSynchronousActions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENTS:
				getSupportedStorageElements().clear();
				getSupportedStorageElements().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__COMPOSITION_METHODS_SUPPORTED:
				getCompositionMethodsSupported().clear();
				getCompositionMethodsSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__COMPOSITE_SOURCES_SUPPORTED:
				getCompositeSourcesSupported().clear();
				getCompositeSourcesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTS_COMPOSITE_NAMING:
				setSupportsCompositeNaming((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTS_REPRESENTATIVE_ELEMENT:
				setSupportsRepresentativeElement((Boolean)newValue);
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
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTS_COMPOSITES:
				setSupportsComposites(SUPPORTS_COMPOSITES_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__MAX_COMPOSITE_SIZE:
				setMaxCompositeSize(MAX_COMPOSITE_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__MAX_COMPOSITE_ELEMENTS:
				setMaxCompositeElements(MAX_COMPOSITE_ELEMENTS_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__COMPOSITION_CHARACTERISTICS:
				getCompositionCharacteristics().clear();
				return;
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSupportedAsynchronousActions().clear();
				return;
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
				return;
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENTS:
				getSupportedStorageElements().clear();
				return;
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__COMPOSITION_METHODS_SUPPORTED:
				getCompositionMethodsSupported().clear();
				return;
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__COMPOSITE_SOURCES_SUPPORTED:
				getCompositeSourcesSupported().clear();
				return;
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTS_COMPOSITE_NAMING:
				setSupportsCompositeNaming(SUPPORTS_COMPOSITE_NAMING_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTS_REPRESENTATIVE_ELEMENT:
				setSupportsRepresentativeElement(SUPPORTS_REPRESENTATIVE_ELEMENT_EDEFAULT);
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
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTS_COMPOSITES:
				return SUPPORTS_COMPOSITES_EDEFAULT == null ? supportsComposites != null : !SUPPORTS_COMPOSITES_EDEFAULT.equals(supportsComposites);
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__MAX_COMPOSITE_SIZE:
				return MAX_COMPOSITE_SIZE_EDEFAULT == null ? maxCompositeSize != null : !MAX_COMPOSITE_SIZE_EDEFAULT.equals(maxCompositeSize);
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__MAX_COMPOSITE_ELEMENTS:
				return MAX_COMPOSITE_ELEMENTS_EDEFAULT == null ? maxCompositeElements != null : !MAX_COMPOSITE_ELEMENTS_EDEFAULT.equals(maxCompositeElements);
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__COMPOSITION_CHARACTERISTICS:
				return compositionCharacteristics != null && !compositionCharacteristics.isEmpty();
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return supportedAsynchronousActions != null && !supportedAsynchronousActions.isEmpty();
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return supportedSynchronousActions != null && !supportedSynchronousActions.isEmpty();
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENTS:
				return supportedStorageElements != null && !supportedStorageElements.isEmpty();
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__COMPOSITION_METHODS_SUPPORTED:
				return compositionMethodsSupported != null && !compositionMethodsSupported.isEmpty();
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__COMPOSITE_SOURCES_SUPPORTED:
				return compositeSourcesSupported != null && !compositeSourcesSupported.isEmpty();
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTS_COMPOSITE_NAMING:
				return SUPPORTS_COMPOSITE_NAMING_EDEFAULT == null ? supportsCompositeNaming != null : !SUPPORTS_COMPOSITE_NAMING_EDEFAULT.equals(supportsCompositeNaming);
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES__SUPPORTS_REPRESENTATIVE_ELEMENT:
				return SUPPORTS_REPRESENTATIVE_ELEMENT_EDEFAULT == null ? supportsRepresentativeElement != null : !SUPPORTS_REPRESENTATIVE_ELEMENT_EDEFAULT.equals(supportsRepresentativeElement);
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
		result.append(" (SupportsComposites: ");
		result.append(supportsComposites);
		result.append(", MaxCompositeSize: ");
		result.append(maxCompositeSize);
		result.append(", MaxCompositeElements: ");
		result.append(maxCompositeElements);
		result.append(", CompositionCharacteristics: ");
		result.append(compositionCharacteristics);
		result.append(", SupportedAsynchronousActions: ");
		result.append(supportedAsynchronousActions);
		result.append(", SupportedSynchronousActions: ");
		result.append(supportedSynchronousActions);
		result.append(", SupportedStorageElements: ");
		result.append(supportedStorageElements);
		result.append(", CompositionMethodsSupported: ");
		result.append(compositionMethodsSupported);
		result.append(", CompositeSourcesSupported: ");
		result.append(compositeSourcesSupported);
		result.append(", SupportsCompositeNaming: ");
		result.append(supportsCompositeNaming);
		result.append(", SupportsRepresentativeElement: ");
		result.append(supportsRepresentativeElement);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageElementCompositionCapabilitiesImpl
