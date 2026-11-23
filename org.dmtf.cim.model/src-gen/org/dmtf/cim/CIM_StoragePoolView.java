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
 * A representation of the model object '<em><b>CIM Storage Pool View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_StoragePoolView is a view that is derived from CIM_StoragePool, CIM_StorageCapabilities, CIM_ElementCapabilities, CIM_StorageConfigurationCapabilities, and CIM_AllocatedFromStoragePool.
 * CIM_ElementView may associate CIM_StoragePoolView to its underlying elements (regardless of whether or not they are instantiated).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSPInstanceID <em>SP Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSPElementName <em>SP Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSPPoolID <em>SP Pool ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSPRemainingManagedSpace <em>SP Remaining Managed Space</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSPTotalManagedSpace <em>SP Total Managed Space</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSPPrimordial <em>SP Primordial</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSPUsage <em>SP Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSPOtherUsageDescription <em>SP Other Usage Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSPClientSettableUsage <em>SP Client Settable Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCInstanceID <em>SC Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCElementName <em>SC Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCElementType <em>SC Element Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCNoSinglePointOfFailure <em>SC No Single Point Of Failure</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCNoSinglePointOfFailureDefault <em>SC No Single Point Of Failure Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCPackageRedundancyDefault <em>SC Package Redundancy Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCPackageRedundancyMin <em>SC Package Redundancy Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCPackageRedundancyMax <em>SC Package Redundancy Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCDataRedundancyDefault <em>SC Data Redundancy Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCDataRedundancyMin <em>SC Data Redundancy Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCDataRedundancyMax <em>SC Data Redundancy Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCExtentStripeLengthDefault <em>SC Extent Stripe Length Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCParityLayoutDefault <em>SC Parity Layout Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCUserDataStripeDepthDefault <em>SC User Data Stripe Depth Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getAFSPSpaceConsumed <em>AFSP Space Consumed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCCInstanceID <em>SCC Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCCElementName <em>SCC Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCCSupportedStoragePoolFeatures <em>SCC Supported Storage Pool Features</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCCSupportedStorageElementTypes <em>SCC Supported Storage Element Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCCSupportedStorageElementFeatures <em>SCC Supported Storage Element Features</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCCSupportedSynchronousActions <em>SCC Supported Synchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCCSupportedAsynchronousActions <em>SCC Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCCSupportedStorageElementUsage <em>SCC Supported Storage Element Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCCClientSettableElementUsage <em>SCC Client Settable Element Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCCSupportedStoragePoolUsage <em>SCC Supported Storage Pool Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePoolView#getSCCClientSettablePoolUsage <em>SCC Client Settable Pool Usage</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Views' keys='SPInstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StoragePoolView extends CIM_View {
	/**
	 * Returns the value of the '<em><b>SP Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InstanceID of the StoragePool as reported in its underlying StoragePool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SP Instance ID</em>' attribute.
	 * @see #setSPInstanceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SPInstanceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_StoragePool.InstanceID\"]'"
	 * @generated
	 */
	String getSPInstanceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSPInstanceID <em>SP Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SP Instance ID</em>' attribute.
	 * @see #getSPInstanceID()
	 * @generated
	 */
	void setSPInstanceID(String value);

	/**
	 * Returns the value of the '<em><b>SP Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ElementName of the StoragePool as reported in its underlying StoragePool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SP Element Name</em>' attribute.
	 * @see #setSPElementName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SPElementName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StoragePool.ElementName\"]'"
	 * @generated
	 */
	String getSPElementName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSPElementName <em>SP Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SP Element Name</em>' attribute.
	 * @see #getSPElementName()
	 * @generated
	 */
	void setSPElementName(String value);

	/**
	 * Returns the value of the '<em><b>SP Pool ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PoolID of the StoragePool as reported in its underlying StoragePool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SP Pool ID</em>' attribute.
	 * @see #setSPPoolID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SPPoolID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StoragePool.PoolID\"]'"
	 * @generated
	 */
	String getSPPoolID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSPPoolID <em>SP Pool ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SP Pool ID</em>' attribute.
	 * @see #getSPPoolID()
	 * @generated
	 */
	void setSPPoolID(String value);

	/**
	 * Returns the value of the '<em><b>SP Remaining Managed Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The RemainingManagedSpace of the StoragePool as reported in its underlying StoragePool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SP Remaining Managed Space</em>' attribute.
	 * @see #setSPRemainingManagedSpace(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SPRemainingManagedSpace()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StoragePool.RemainingManagedSpace\"]'"
	 * @generated
	 */
	Long getSPRemainingManagedSpace();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSPRemainingManagedSpace <em>SP Remaining Managed Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SP Remaining Managed Space</em>' attribute.
	 * @see #getSPRemainingManagedSpace()
	 * @generated
	 */
	void setSPRemainingManagedSpace(Long value);

	/**
	 * Returns the value of the '<em><b>SP Total Managed Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TotalManagedSpace of the StoragePool as reported in its underlying StoragePool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SP Total Managed Space</em>' attribute.
	 * @see #setSPTotalManagedSpace(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SPTotalManagedSpace()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StoragePool.TotalManagedSpace\"]'"
	 * @generated
	 */
	Long getSPTotalManagedSpace();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSPTotalManagedSpace <em>SP Total Managed Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SP Total Managed Space</em>' attribute.
	 * @see #getSPTotalManagedSpace()
	 * @generated
	 */
	void setSPTotalManagedSpace(Long value);

	/**
	 * Returns the value of the '<em><b>SP Primordial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Primordial property of the StoragePool as reported in its underlying StoragePool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SP Primordial</em>' attribute.
	 * @see #setSPPrimordial(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SPPrimordial()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_StoragePool.Primordial\"]'"
	 * @generated
	 */
	Boolean getSPPrimordial();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSPPrimordial <em>SP Primordial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SP Primordial</em>' attribute.
	 * @see #getSPPrimordial()
	 * @generated
	 */
	void setSPPrimordial(Boolean value);

	/**
	 * Returns the value of the '<em><b>SP Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Usage property of the StoragePool as reported in its underlying StoragePool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SP Usage</em>' attribute.
	 * @see #setSPUsage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SPUsage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StoragePool.Usage\"]'"
	 * @generated
	 */
	Integer getSPUsage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSPUsage <em>SP Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SP Usage</em>' attribute.
	 * @see #getSPUsage()
	 * @generated
	 */
	void setSPUsage(Integer value);

	/**
	 * Returns the value of the '<em><b>SP Other Usage Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OtherUsageDescription of the StoragePool as reported in its underlying StoragePool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SP Other Usage Description</em>' attribute.
	 * @see #setSPOtherUsageDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SPOtherUsageDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StoragePool.OtherUsageDescription\"]'"
	 * @generated
	 */
	String getSPOtherUsageDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSPOtherUsageDescription <em>SP Other Usage Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SP Other Usage Description</em>' attribute.
	 * @see #getSPOtherUsageDescription()
	 * @generated
	 */
	void setSPOtherUsageDescription(String value);

	/**
	 * Returns the value of the '<em><b>SP Client Settable Usage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ClientSettableUsage property of the StoragePool as reported in its underlying StoragePool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SP Client Settable Usage</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SPClientSettableUsage()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_StoragePool.ClientSettableUsage\"]'"
	 * @generated
	 */
	EList<Integer> getSPClientSettableUsage();

	/**
	 * Returns the value of the '<em><b>SC Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InstanceID of the StorageCapabilities for the StoragePool as reported in its underlying StorageCapabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SC Instance ID</em>' attribute.
	 * @see #setSCInstanceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCInstanceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageCapabilities.InstanceID\"]'"
	 * @generated
	 */
	String getSCInstanceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSCInstanceID <em>SC Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SC Instance ID</em>' attribute.
	 * @see #getSCInstanceID()
	 * @generated
	 */
	void setSCInstanceID(String value);

	/**
	 * Returns the value of the '<em><b>SC Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ElementName of the StorageCapabilities for the StoragePool as reported in its underlying StorageCapabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SC Element Name</em>' attribute.
	 * @see #setSCElementName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCElementName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageCapabilities.ElementName\"]'"
	 * @generated
	 */
	String getSCElementName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSCElementName <em>SC Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SC Element Name</em>' attribute.
	 * @see #getSCElementName()
	 * @generated
	 */
	void setSCElementName(String value);

	/**
	 * Returns the value of the '<em><b>SC Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ElementType of the StorageCapabilities for the StoragePool as reported in its underlying StorageCapabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SC Element Type</em>' attribute.
	 * @see #setSCElementType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCElementType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageCapabilities.ElementType\"]'"
	 * @generated
	 */
	Integer getSCElementType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSCElementType <em>SC Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SC Element Type</em>' attribute.
	 * @see #getSCElementType()
	 * @generated
	 */
	void setSCElementType(Integer value);

	/**
	 * Returns the value of the '<em><b>SC No Single Point Of Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The NoSinglePointOfFailure property of the StorageCapabilities for the StoragePool as reported in its underlying StorageCapabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SC No Single Point Of Failure</em>' attribute.
	 * @see #setSCNoSinglePointOfFailure(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCNoSinglePointOfFailure()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_StorageCapabilities.NoSinglePointOfFailure\"]'"
	 * @generated
	 */
	Boolean getSCNoSinglePointOfFailure();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSCNoSinglePointOfFailure <em>SC No Single Point Of Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SC No Single Point Of Failure</em>' attribute.
	 * @see #getSCNoSinglePointOfFailure()
	 * @generated
	 */
	void setSCNoSinglePointOfFailure(Boolean value);

	/**
	 * Returns the value of the '<em><b>SC No Single Point Of Failure Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The NoSinglePointOfFailureDefault property of the StorageCapabilities for the StoragePool as reported in its underlying StorageCapabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SC No Single Point Of Failure Default</em>' attribute.
	 * @see #setSCNoSinglePointOfFailureDefault(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCNoSinglePointOfFailureDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_StorageCapabilities.NoSinglePointOfFailureDefault\"]'"
	 * @generated
	 */
	Boolean getSCNoSinglePointOfFailureDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSCNoSinglePointOfFailureDefault <em>SC No Single Point Of Failure Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SC No Single Point Of Failure Default</em>' attribute.
	 * @see #getSCNoSinglePointOfFailureDefault()
	 * @generated
	 */
	void setSCNoSinglePointOfFailureDefault(Boolean value);

	/**
	 * Returns the value of the '<em><b>SC Package Redundancy Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PackageRedundancyDefault property of the StorageCapabilities for the StoragePool as reported in its underlying StorageCapabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SC Package Redundancy Default</em>' attribute.
	 * @see #setSCPackageRedundancyDefault(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCPackageRedundancyDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageCapabilities.PackageRedundancyDefault\"]'"
	 * @generated
	 */
	Integer getSCPackageRedundancyDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSCPackageRedundancyDefault <em>SC Package Redundancy Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SC Package Redundancy Default</em>' attribute.
	 * @see #getSCPackageRedundancyDefault()
	 * @generated
	 */
	void setSCPackageRedundancyDefault(Integer value);

	/**
	 * Returns the value of the '<em><b>SC Package Redundancy Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PackageRedundancyMin property of the StorageCapabilities for the StoragePool as reported in its underlying StorageCapabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SC Package Redundancy Min</em>' attribute.
	 * @see #setSCPackageRedundancyMin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCPackageRedundancyMin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageCapabilities.PackageRedundancyMin\"]'"
	 * @generated
	 */
	Integer getSCPackageRedundancyMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSCPackageRedundancyMin <em>SC Package Redundancy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SC Package Redundancy Min</em>' attribute.
	 * @see #getSCPackageRedundancyMin()
	 * @generated
	 */
	void setSCPackageRedundancyMin(Integer value);

	/**
	 * Returns the value of the '<em><b>SC Package Redundancy Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PackageRedundancyMax property of the StorageCapabilities for the StoragePool as reported in its underlying StorageCapabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SC Package Redundancy Max</em>' attribute.
	 * @see #setSCPackageRedundancyMax(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCPackageRedundancyMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageCapabilities.PackageRedundancyMax\"]'"
	 * @generated
	 */
	Integer getSCPackageRedundancyMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSCPackageRedundancyMax <em>SC Package Redundancy Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SC Package Redundancy Max</em>' attribute.
	 * @see #getSCPackageRedundancyMax()
	 * @generated
	 */
	void setSCPackageRedundancyMax(Integer value);

	/**
	 * Returns the value of the '<em><b>SC Data Redundancy Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DataRedundancyDefault property of the StorageCapabilities for the StoragePool as reported in its underlying StorageCapabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SC Data Redundancy Default</em>' attribute.
	 * @see #setSCDataRedundancyDefault(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCDataRedundancyDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageCapabilities.DataRedundancyDefault\"]'"
	 * @generated
	 */
	Integer getSCDataRedundancyDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSCDataRedundancyDefault <em>SC Data Redundancy Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SC Data Redundancy Default</em>' attribute.
	 * @see #getSCDataRedundancyDefault()
	 * @generated
	 */
	void setSCDataRedundancyDefault(Integer value);

	/**
	 * Returns the value of the '<em><b>SC Data Redundancy Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DataRedundancyMin property of the StorageCapabilities for the StoragePool as reported in its underlying StorageCapabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SC Data Redundancy Min</em>' attribute.
	 * @see #setSCDataRedundancyMin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCDataRedundancyMin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageCapabilities.DataRedundancyMin\"]'"
	 * @generated
	 */
	Integer getSCDataRedundancyMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSCDataRedundancyMin <em>SC Data Redundancy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SC Data Redundancy Min</em>' attribute.
	 * @see #getSCDataRedundancyMin()
	 * @generated
	 */
	void setSCDataRedundancyMin(Integer value);

	/**
	 * Returns the value of the '<em><b>SC Data Redundancy Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DataRedundancyMax property of the StorageCapabilities for the StoragePool as reported in its underlying StorageCapabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SC Data Redundancy Max</em>' attribute.
	 * @see #setSCDataRedundancyMax(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCDataRedundancyMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageCapabilities.DataRedundancyMax\"]'"
	 * @generated
	 */
	Integer getSCDataRedundancyMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSCDataRedundancyMax <em>SC Data Redundancy Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SC Data Redundancy Max</em>' attribute.
	 * @see #getSCDataRedundancyMax()
	 * @generated
	 */
	void setSCDataRedundancyMax(Integer value);

	/**
	 * Returns the value of the '<em><b>SC Extent Stripe Length Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExtentStripeLengthDefault property of the StorageCapabilities for the StoragePool as reported in its underlying StorageCapabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SC Extent Stripe Length Default</em>' attribute.
	 * @see #setSCExtentStripeLengthDefault(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCExtentStripeLengthDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageCapabilities.ExtentStripeLengthDefault\"]'"
	 * @generated
	 */
	Integer getSCExtentStripeLengthDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSCExtentStripeLengthDefault <em>SC Extent Stripe Length Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SC Extent Stripe Length Default</em>' attribute.
	 * @see #getSCExtentStripeLengthDefault()
	 * @generated
	 */
	void setSCExtentStripeLengthDefault(Integer value);

	/**
	 * Returns the value of the '<em><b>SC Parity Layout Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ParityLayoutDefault property of the StorageCapabilities for the StoragePool as reported in its underlying StorageCapabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SC Parity Layout Default</em>' attribute.
	 * @see #setSCParityLayoutDefault(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCParityLayoutDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageCapabilities.ParityLayoutDefault\"]'"
	 * @generated
	 */
	Integer getSCParityLayoutDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSCParityLayoutDefault <em>SC Parity Layout Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SC Parity Layout Default</em>' attribute.
	 * @see #getSCParityLayoutDefault()
	 * @generated
	 */
	void setSCParityLayoutDefault(Integer value);

	/**
	 * Returns the value of the '<em><b>SC User Data Stripe Depth Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UserDataStripeDepthDefault property of the StorageCapabilities for the StoragePool as reported in its underlying StorageCapabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SC User Data Stripe Depth Default</em>' attribute.
	 * @see #setSCUserDataStripeDepthDefault(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCUserDataStripeDepthDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageCapabilities.UserDataStripeDepthDefault\"]'"
	 * @generated
	 */
	Long getSCUserDataStripeDepthDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSCUserDataStripeDepthDefault <em>SC User Data Stripe Depth Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SC User Data Stripe Depth Default</em>' attribute.
	 * @see #getSCUserDataStripeDepthDefault()
	 * @generated
	 */
	void setSCUserDataStripeDepthDefault(Long value);

	/**
	 * Returns the value of the '<em><b>AFSP Space Consumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SpaceConsumed from the Parent Pool of the StoragePool as reported in its underlying AllocatedFromStoragePool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AFSP Space Consumed</em>' attribute.
	 * @see #setAFSPSpaceConsumed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_AFSPSpaceConsumed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_AllocatedFromStoragePool.SpaceConsumed\"]'"
	 * @generated
	 */
	Long getAFSPSpaceConsumed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getAFSPSpaceConsumed <em>AFSP Space Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AFSP Space Consumed</em>' attribute.
	 * @see #getAFSPSpaceConsumed()
	 * @generated
	 */
	void setAFSPSpaceConsumed(Long value);

	/**
	 * Returns the value of the '<em><b>SCC Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InstanceID of the StorageConfigurationCapabilities for the StoragePool as reported in its underlying StorageConfigurationCapabilities. This is NULL if a StorageConfigurationCapabilities does not exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SCC Instance ID</em>' attribute.
	 * @see #setSCCInstanceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCCInstanceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageConfigurationCapabilities.InstanceID\"]'"
	 * @generated
	 */
	String getSCCInstanceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSCCInstanceID <em>SCC Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SCC Instance ID</em>' attribute.
	 * @see #getSCCInstanceID()
	 * @generated
	 */
	void setSCCInstanceID(String value);

	/**
	 * Returns the value of the '<em><b>SCC Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ElementName of the StorageConfigurationCapabilities for the StoragePool as reported in its underlying StorageConfigurationCapabilities. This is NULL if a StorageConfigurationCapabilities does not exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SCC Element Name</em>' attribute.
	 * @see #setSCCElementName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCCElementName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageConfigurationCapabilities.ElementName\"]'"
	 * @generated
	 */
	String getSCCElementName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePoolView#getSCCElementName <em>SCC Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SCC Element Name</em>' attribute.
	 * @see #getSCCElementName()
	 * @generated
	 */
	void setSCCElementName(String value);

	/**
	 * Returns the value of the '<em><b>SCC Supported Storage Pool Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SupportedStoragePoolFeatures of the StorageConfigurationCapabilities for the StoragePool as reported in its underlying StorageConfigurationCapabilities. This is NULL if a StorageConfigurationCapabilities does not exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SCC Supported Storage Pool Features</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCCSupportedStoragePoolFeatures()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_StorageConfigurationCapabilities.SupportedStoragePoolFeatures\"]'"
	 * @generated
	 */
	EList<Integer> getSCCSupportedStoragePoolFeatures();

	/**
	 * Returns the value of the '<em><b>SCC Supported Storage Element Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SupportedStorageElementTypes of the StorageConfigurationCapabilities for the StoragePool as reported in its underlying StorageConfigurationCapabilities. This is NULL if a StorageConfigurationCapabilities does not exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SCC Supported Storage Element Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCCSupportedStorageElementTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_StorageConfigurationCapabilities.SupportedStorageElementTypes\"]'"
	 * @generated
	 */
	EList<Integer> getSCCSupportedStorageElementTypes();

	/**
	 * Returns the value of the '<em><b>SCC Supported Storage Element Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SupportedStorageElementlFeatures of the StorageConfigurationCapabilities for the StoragePool as reported in its underlying StorageConfigurationCapabilities. This is NULL if a StorageConfigurationCapabilities does not exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SCC Supported Storage Element Features</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCCSupportedStorageElementFeatures()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_StorageConfigurationCapabilities.SupportedStorageElementFeatures\"]'"
	 * @generated
	 */
	EList<Integer> getSCCSupportedStorageElementFeatures();

	/**
	 * Returns the value of the '<em><b>SCC Supported Synchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SupportedSynchronousActions of the StorageConfigurationCapabilities for the StoragePool as reported in its underlying StorageConfigurationCapabilities. This is NULL if a StorageConfigurationCapabilities does not exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SCC Supported Synchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCCSupportedSynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_StorageConfigurationCapabilities.SupportedSynchronousActions\"]'"
	 * @generated
	 */
	EList<Integer> getSCCSupportedSynchronousActions();

	/**
	 * Returns the value of the '<em><b>SCC Supported Asynchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SupportedAsynchronousActions of the StorageConfigurationCapabilities for the StoragePool as reported in its underlying StorageConfigurationCapabilities. This is NULL if a StorageConfigurationCapabilities does not exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SCC Supported Asynchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCCSupportedAsynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_StorageConfigurationCapabilities.SupportedAsynchronousActions\"]'"
	 * @generated
	 */
	EList<Integer> getSCCSupportedAsynchronousActions();

	/**
	 * Returns the value of the '<em><b>SCC Supported Storage Element Usage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SupportedStorageElementUsage of the StorageConfigurationCapabilities for the StoragePool as reported in its underlying StorageConfigurationCapabilities. This is NULL if a StorageConfigurationCapabilities does not exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SCC Supported Storage Element Usage</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCCSupportedStorageElementUsage()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_StorageConfigurationCapabilities.SupportedStorageElementUsage\"]'"
	 * @generated
	 */
	EList<Integer> getSCCSupportedStorageElementUsage();

	/**
	 * Returns the value of the '<em><b>SCC Client Settable Element Usage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ClientSettableElementUsage of the StorageConfigurationCapabilities for the StoragePool as reported in its underlying StorageConfigurationCapabilities. This is NULL if a StorageConfigurationCapabilities does not exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SCC Client Settable Element Usage</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCCClientSettableElementUsage()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_StorageConfigurationCapabilities.ClientSettableElementUsage\"]'"
	 * @generated
	 */
	EList<String> getSCCClientSettableElementUsage();

	/**
	 * Returns the value of the '<em><b>SCC Supported Storage Pool Usage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SupportedStoragePoolUsage of the StorageConfigurationCapabilities for the StoragePool as reported in its underlying StorageConfigurationCapabilities. This is NULL if a StorageConfigurationCapabilities does not exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SCC Supported Storage Pool Usage</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCCSupportedStoragePoolUsage()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_StorageConfigurationCapabilities.SupportedStoragePoolUsage\"]'"
	 * @generated
	 */
	EList<String> getSCCSupportedStoragePoolUsage();

	/**
	 * Returns the value of the '<em><b>SCC Client Settable Pool Usage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ClientSettablePoolUsage of the StorageConfigurationCapabilities for the StoragePool as reported in its underlying StorageConfigurationCapabilities. This is NULL if a StorageConfigurationCapabilities does not exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SCC Client Settable Pool Usage</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePoolView_SCCClientSettablePoolUsage()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_StorageConfigurationCapabilities.ClientSettablePoolUsage\"]'"
	 * @generated
	 */
	EList<String> getSCCClientSettablePoolUsage();

} // CIM_StoragePoolView
