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
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Physical Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The PhysicalComponent class represents any low-level or basic Component within a Package. A Component object either can not or does not need to be decomposed into its constituent parts. For example, an ASIC (or Chip) can not be further decomposed. A tape for data storage (PhysicalMedia) does not need to be decomposed. Any PhysicalElement that is not a Link, Connector, or Package is a descendent (or member) of this class. For example, the UART chipset on an internal modem Card would be a subclass (if additional properties or associations are defined) or an instance of PhysicalComponent.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComponent#getRemovalConditions <em>Removal Conditions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComponent#getRemovable <em>Removable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComponent#getReplaceable <em>Replaceable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComponent#getHotSwappable <em>Hot Swappable</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComponent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Physical::Component' keys='Tag,CreationClassName'"
 * @generated
 */
@ProviderType
public interface CIM_PhysicalComponent extends CIM_PhysicalElement {
	/**
	 * Returns the value of the '<em><b>Removal Conditions</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The RemovalCapabilites property is used to describe the conditions under which a PhysicalPackage can be removed. Since all PhysicalPackages are not removable, this property defaults to 2, 'Not Applicable'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Removal Conditions</em>' attribute.
	 * @see #setRemovalConditions(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComponent_RemovalConditions()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Not Applicable\",\"Removable when off\",\"Removable when on or off\"]'"
	 * @generated
	 */
	Integer getRemovalConditions();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComponent#getRemovalConditions <em>Removal Conditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removal Conditions</em>' attribute.
	 * @see #getRemovalConditions()
	 * @generated
	 */
	void setRemovalConditions(Integer value);

	/**
	 * Returns the value of the '<em><b>Removable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The use of this property is being deprecated. Instead RemovalConditions should be used. The RemovalConditions property addresses whether a PhysicalComponent is removable with or without power being applied. 
	 * 
	 * A PhysicalComponent is Removable if it is designed to be taken in and out of the physical container in which it is normally found, without impairing the function of the overall packaging. A Component can still be Removable if power must be 'off' in order to perform the removal. If power can be 'on' and the Component removed, then the Element is both Removable and HotSwappable. For example, an upgradeable Processor chip is Removable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Removable</em>' attribute.
	 * @see #setRemovable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComponent_Removable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_PhysicalComponent.RemovalConditions\"]'"
	 * @generated
	 */
	Boolean getRemovable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComponent#getRemovable <em>Removable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removable</em>' attribute.
	 * @see #getRemovable()
	 * @generated
	 */
	void setRemovable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The use of this property is being deprecated because it is redundant with the FRU class and its associations. A PhysicalComponent is Replaceable if it is possible to replace (FRU or upgrade) the Element with a physically different one. For example, some ComputerSystems allow the main Processor chip to be upgraded to one of a higher clock rating. In this case, the Processor is said to be Replaceable. All Removable Components are inherently Replaceable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replaceable</em>' attribute.
	 * @see #setReplaceable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComponent_Replaceable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	Boolean getReplaceable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComponent#getReplaceable <em>Replaceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replaceable</em>' attribute.
	 * @see #getReplaceable()
	 * @generated
	 */
	void setReplaceable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Hot Swappable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The use of this property is being deprecated. Instead RemovalConditions should be used. The RemovalConditions property addresses whether a PhysicalComponent is removable with or without power being applied. 
	 * 
	 * A PhysicalComponent is HotSwappable if it is possible to replace the Element with a physically different but equivalent one while the containing Package has power applied to it (ie, is 'on'). For example, a fan Component may be designed to be HotSwappable. All HotSwappable Components are inherently Removable and Replaceable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hot Swappable</em>' attribute.
	 * @see #setHotSwappable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComponent_HotSwappable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_PhysicalComponent.RemovalConditions\"]'"
	 * @generated
	 */
	Boolean getHotSwappable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComponent#getHotSwappable <em>Hot Swappable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hot Swappable</em>' attribute.
	 * @see #getHotSwappable()
	 * @generated
	 */
	void setHotSwappable(Boolean value);

} // CIM_PhysicalComponent
