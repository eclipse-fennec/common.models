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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Storage Element Composition Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Configuration settings for Storage Element Composition service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageElementCompositionCapabilities#getSupportsComposites <em>Supports Composites</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageElementCompositionCapabilities#getMaxCompositeSize <em>Max Composite Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageElementCompositionCapabilities#getMaxCompositeElements <em>Max Composite Elements</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageElementCompositionCapabilities#getCompositionCharacteristics <em>Composition Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageElementCompositionCapabilities#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageElementCompositionCapabilities#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageElementCompositionCapabilities#getSupportedStorageElements <em>Supported Storage Elements</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageElementCompositionCapabilities#getCompositionMethodsSupported <em>Composition Methods Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageElementCompositionCapabilities#getCompositeSourcesSupported <em>Composite Sources Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageElementCompositionCapabilities#getSupportsCompositeNaming <em>Supports Composite Naming</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageElementCompositionCapabilities#getSupportsRepresentativeElement <em>Supports Representative Element</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageElementCompositionCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.49.0' UMLPackagePath='CIM::Device::StorageServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StorageElementCompositionCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supports Composites</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if instrumentation supports composite elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supports Composites</em>' attribute.
	 * @see #setSupportsComposites(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageElementCompositionCapabilities_SupportsComposites()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSupportsComposites();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageElementCompositionCapabilities#getSupportsComposites <em>Supports Composites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports Composites</em>' attribute.
	 * @see #getSupportsComposites()
	 * @generated
	 */
	void setSupportsComposites(Boolean value);

	/**
	 * Returns the value of the '<em><b>Max Composite Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the Largest composite element that can be created in bytes. Set to 0 if this information is not known, or MaxCompositeSize is unlimited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Composite Size</em>' attribute.
	 * @see #setMaxCompositeSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageElementCompositionCapabilities_MaxCompositeSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' PUnit='byte'"
	 * @generated
	 */
	Long getMaxCompositeSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageElementCompositionCapabilities#getMaxCompositeSize <em>Max Composite Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Composite Size</em>' attribute.
	 * @see #getMaxCompositeSize()
	 * @generated
	 */
	void setMaxCompositeSize(Long value);

	/**
	 * Returns the value of the '<em><b>Max Composite Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the most elements that can be combined into a composite element. Set to 0 if this information is not known, or MaxCompositeElements is unlimited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Composite Elements</em>' attribute.
	 * @see #setMaxCompositeElements(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageElementCompositionCapabilities_MaxCompositeElements()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getMaxCompositeElements();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageElementCompositionCapabilities#getMaxCompositeElements <em>Max Composite Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Composite Elements</em>' attribute.
	 * @see #getMaxCompositeElements()
	 * @generated
	 */
	void setMaxCompositeElements(Long value);

	/**
	 * Returns the value of the '<em><b>Composition Characteristics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Composition characteristics supported by this system. 
	 * Description of values: 
	 * - CompositionIsDestructive - any data that exists on the elements will be destroyed when the composite is created 
	 * - CanCompositeComposites - it is possible to use an existing composite as an element to a new composite 
	 * - CanModifyComposite - An existing composite can be modified by adding or removing one or more elements 
	 * - CompositeElementsMustBeSameSize - all elements used to create/modify a composite must be the same size 
	 * - CompositeElementsMustBeSameRAID/QoS - all elements used to create/modify a composite must have the same RAID or QoS level 
	 * - DecompositionDeletesElements - When the composite is dissolved the component elments (e.g. StorageVolumes) are deleted 
	 * - CanAddToComposite - Elements can be added to a composite in any position 
	 * - CanAppendToComposite - Elements can only be added at the end of a composite 
	 * - CanRemoveFromComposite - Elements can be removed from a composite 
	 * - CompositeAdditionIsDestructive - Adding elements to a composite results in loss of data 
	 * - CompositeRemovalIsDestructive - Removing elements from a composite results in loss of data 
	 * - CompositeAdditionCanPreserveData- Adding elements to a composite can preserve data 
	 * - CompositionCanPreserveData - Any data that exists on the elements can be preserved when the composite is created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Composition Characteristics</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageElementCompositionCapabilities_CompositionCharacteristics()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"..\",\"32768..65535\"]' Values='[\"CompositionIsDestructive\",\"CanCompositeComposites\",\"CanModifyComposite\",\"CompositeElementsMustBeSameSize\",\"CompositeElementsMustBeSameRAID/QoS\",\"DecompositionDeletesElements\",\"CanAddToComposite\",\"CanAppendToComposite\",\"CanRemoveFromComposite\",\"CompositeAdditionIsDestructive\",\"CompositeRemovalIsDestructive\",\"CompositeAdditionCanPreserveData\",\"CompositionCanPreserveData\",\"DMTF reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getCompositionCharacteristics();

	/**
	 * Returns the value of the '<em><b>Supported Asynchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating what operations will be executed as asynchronous jobs. If an operation is included in both this and SupportedSynchronousActions then the underlying implementation is indicating that it may or may not create a job.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Asynchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageElementCompositionCapabilities_SupportedAsynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"..\",\"32768..65535\"]' Values='[\"CreateOrModifyCompositeElement\",\"ReturnElementToElements\",\"GetAvailableElements\",\"GetCompositeElements\",\"RemoveElementsFromElement\",\"GetSupportedStripeLengths\",\"GetSupportedStripeLengthRange\",\"GetSupportedStripeDepths\",\"GetSupportedStripeDepthRange\",\"Multiple Composite Element Creation\",\"StorageConfigurationService.ReturnToStoragePool\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedAsynchronousActions();

	/**
	 * Returns the value of the '<em><b>Supported Synchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating what operations will be executed without the creation of a job. If an operation is included in both this and SupportedAsynchronousActions then the underlying instrumentation is indicating that it may or may not create a job.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Synchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageElementCompositionCapabilities_SupportedSynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"..\",\"32768..65535\"]' Values='[\"CreateOrModifyCompositeElement\",\"ReturnElementToElements\",\"GetAvailableElements\",\"GetCompositeElements\",\"RemoveElementsFromElement\",\"GetSupportedStripeLengths\",\"GetSupportedStripeLengthRange\",\"GetSupportedStripeDepths\",\"GetSupportedStripeDepthRange\",\"Multiple Composite Element Creation\",\"StorageConfigurationService.ReturnToStoragePool\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedSynchronousActions();

	/**
	 * Returns the value of the '<em><b>Supported Storage Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Managed element types that can be composited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Storage Elements</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageElementCompositionCapabilities_SupportedStorageElements()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\",\"32768..65535\"]' Values='[\"StorageVolume\",\"LogicalDisk\",\"ThinStorageVolume\",\"LocalMirror\",\"ThinLocalMirror\",\"LocalSnap\",\"ThinLocalSnap\",\"ThinLocalMirrorPersistent\",\"FullyProvisionedStorageVolume\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedStorageElements();

	/**
	 * Returns the value of the '<em><b>Composition Methods Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates which composition methods are supported. Possible values are Concatenate, Stripe, Concatenate+Stripe, Vendor specific.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Composition Methods Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageElementCompositionCapabilities_CompositionMethodsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Concatenate elements\",\"Stripe elements\",\"Concatenate and stripe elements\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getCompositionMethodsSupported();

	/**
	 * Returns the value of the '<em><b>Composite Sources Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates which sources for elements are supported. Possible values are: 1. Use existing elements only 2. Create new elements only 3. Can use existing or create new or both 4. Instrumentation decides.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Composite Sources Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageElementCompositionCapabilities_CompositeSourcesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"Use existing\",\"Create new\",\"Use and create\",\"Instrumentation decides\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getCompositeSourcesSupported();

	/**
	 * Returns the value of the '<em><b>Supports Composite Naming</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Does the instrumentation support naming the composite element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supports Composite Naming</em>' attribute.
	 * @see #setSupportsCompositeNaming(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageElementCompositionCapabilities_SupportsCompositeNaming()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSupportsCompositeNaming();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageElementCompositionCapabilities#getSupportsCompositeNaming <em>Supports Composite Naming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports Composite Naming</em>' attribute.
	 * @see #getSupportsCompositeNaming()
	 * @generated
	 */
	void setSupportsCompositeNaming(Boolean value);

	/**
	 * Returns the value of the '<em><b>Supports Representative Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Does the instrumentation allow the user to specify the RepresentativeElement in CreateOrModifyComposite.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supports Representative Element</em>' attribute.
	 * @see #setSupportsRepresentativeElement(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageElementCompositionCapabilities_SupportsRepresentativeElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSupportsRepresentativeElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageElementCompositionCapabilities#getSupportsRepresentativeElement <em>Supports Representative Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports Representative Element</em>' attribute.
	 * @see #getSupportsRepresentativeElement()
	 * @generated
	 */
	void setSupportsRepresentativeElement(Boolean value);

} // CIM_StorageElementCompositionCapabilities
