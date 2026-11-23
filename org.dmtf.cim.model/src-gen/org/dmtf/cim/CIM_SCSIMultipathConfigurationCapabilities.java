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
 * A representation of the model object '<em><b>CIM SCSI Multipath Configuration Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from CIM_Capabilities that models the capabilities of a multipath driver. Note that 'path' in this context refers to end-to-end device paths (for example, SCSI initiator/target) with no understanding of edge paths between interconnect elements such as switches. Load balancing only applies to symmetric multipath devices or to the ports in SCSITargetPortGroups in active access state. 
 * A driver may support different algorithms for load balancing. A few common algorithms are listed. Algorithms for specific device models and software vendor specific algorithms are also accommodated. 
 * 
 * An instance of this capabilities class MUST be instantiated whenever SCSIPathConfigurationService is instantiated and they MUST be assocaited one to one using ElementCapabilities. Multiple instances of the service/acapabilities pair MAY exist if multiple multipath drivers are installed. Each LogicalDevice subclass served by the underlying multipath driver is associated to the associated Service instance via ServiceAvailableToELement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getSupportedLoadBalanceTypes <em>Supported Load Balance Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getOtherSupportedLoadBalanceAlgorithmNames <em>Other Supported Load Balance Algorithm Names</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getOtherSupportedLoadBalanceVendorNames <em>Other Supported Load Balance Vendor Names</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getCanSetTPGAccess <em>Can Set TPG Access</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getCanOverridePaths <em>Can Override Paths</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getExposesPathDeviceFiles <em>Exposes Path Device Files</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getDeviceNameFilespace <em>Device Name Filespace</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getOnlySupportsSpecifiedProducts <em>Only Supports Specified Products</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getMaximumWeight <em>Maximum Weight</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getAutofailbackSupport <em>Autofailback Support</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getAutoFailbackEnabled <em>Auto Failback Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getPollingRateMax <em>Polling Rate Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getCurrentPollingRate <em>Current Polling Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getDefaultLoadBalanceType <em>Default Load Balance Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathConfigurationCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.29.0' UMLPackagePath='CIM::Device::StorageDevices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_SCSIMultipathConfigurationCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supported Load Balance Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The load balance types supported by the driver for all logical units on a target device. If 'Product Specified' is included, one or more instances of CIM_Product must be aggregated to the capabilities instance via ConcreteComponent. Each Product instance provides the SCSI Vendor, Product, and Revision ID of a supported product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Load Balance Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathConfigurationCapabilities_SupportedLoadBalanceTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Unknown\",\"Other\",\"No Load Balancing\",\"Round Robin\",\"Least Blocks\",\"Least IO\",\"LBA Region\",\"Product Specific\"]' ArrayType='Indexed' MappingStrings='[\"MP_API.SNIA|MP_LOAD_BALANCE_TYPE\"]' ModelCorrespondence='[\"CIM_SCSIMultipathConfigurationCapabilities.OtherSupportedLoadBalanceAlgorithmNames\",\"CIM_SCSIMultipathConfigurationCapabilities.OtherSupportedLoadBalanceVendorNames\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedLoadBalanceTypes();

	/**
	 * Returns the value of the '<em><b>Other Supported Load Balance Algorithm Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the corresponding array entry in SupportedLoadBalanceTypes[] is 'Other', this entry provides a string describing the load balancing algorithm. When the corresponding array entry in SupportedLoadBalanceTypes[] is 'Product Specific', this entry provides a string specifying the SCSI vendor/product/revision and must be formatted as exactly 28 ASCII characters - 8 for vendor, 16 for product, and 4 for revision (see SCSI SPC Inquiry response)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supported Load Balance Algorithm Names</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathConfigurationCapabilities_OtherSupportedLoadBalanceAlgorithmNames()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"SPC.INCITS-T10 |Standard Inquiry Response\",\"MP_API.SNIA|MP_LOAD_BALANCE_TYPE\",\"MP_API.SNIA|MP_DEVICE_PRODUCT_PROPERTIES\"]' ModelCorrespondence='[\"CIM_SCSIMultipathConfigurationCapabilities.SupportedLoadBalanceTypes\",\"CIM_SCSIMultipathConfigurationCapabilities.OtherSupportedLoadBalanceVendorNames\"]'"
	 * @generated
	 */
	EList<String> getOtherSupportedLoadBalanceAlgorithmNames();

	/**
	 * Returns the value of the '<em><b>Other Supported Load Balance Vendor Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the corresponding array entry in SupportedLoadBalanceTypes[] is 'Other', this entry provides a string describing the vendor associated with the load balancing algorithm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supported Load Balance Vendor Names</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathConfigurationCapabilities_OtherSupportedLoadBalanceVendorNames()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MP_API.SNIA|MP_LOAD_BALANCE_TYPE\"]' ModelCorrespondence='[\"CIM_SCSIMultipathConfigurationCapabilities.SupportedLoadBalanceTypes\",\"CIM_SCSIMultipathConfigurationCapabilities.OtherSupportedLoadBalanceAlgorithmNames\"]'"
	 * @generated
	 */
	EList<String> getOtherSupportedLoadBalanceVendorNames();

	/**
	 * Returns the value of the '<em><b>Can Set TPG Access</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The capability of the driver to support the SetTPGAccess method. True if the implementation supports activating target port groups.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Can Set TPG Access</em>' attribute.
	 * @see #setCanSetTPGAccess(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathConfigurationCapabilities_CanSetTPGAccess()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MP_API.SNIA|MP_PLUGIN_PROPERTIES|canSetTPGAccess\"]' ModelCorrespondence='[\"CIM_SCSIPathConfigurationService.SetTPGAccess\"]'"
	 * @generated
	 */
	Boolean getCanSetTPGAccess();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getCanSetTPGAccess <em>Can Set TPG Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Set TPG Access</em>' attribute.
	 * @see #getCanSetTPGAccess()
	 * @generated
	 */
	void setCanSetTPGAccess(Boolean value);

	/**
	 * Returns the value of the '<em><b>Can Override Paths</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The capability of the driver to support the SetOverridePath and CancelOverridePaths methods. True if the implementation supports path overrides.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Can Override Paths</em>' attribute.
	 * @see #setCanOverridePaths(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathConfigurationCapabilities_CanOverridePaths()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MP_API.SNIA|MP_PLUGIN_PROPERTIES|canOverridePaths\"]' ModelCorrespondence='[\"CIM_SCSIPathConfigurationService.SetOverridePath\"]'"
	 * @generated
	 */
	Boolean getCanOverridePaths();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getCanOverridePaths <em>Can Override Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Override Paths</em>' attribute.
	 * @see #getCanOverridePaths()
	 * @generated
	 */
	void setCanOverridePaths(Boolean value);

	/**
	 * Returns the value of the '<em><b>Exposes Path Device Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * False if the MP drivers assure only a single device file name (e.g. /dev/dsk/...) exists for each MP device. True if the implementation exposes (or leaves exposed) device files for the individual paths encapsulated by the multipath device file. This is typically true for MP drivers that sit near the top of the driver stack and false for transport drivers at the bottom of the stack.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exposes Path Device Files</em>' attribute.
	 * @see #setExposesPathDeviceFiles(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathConfigurationCapabilities_ExposesPathDeviceFiles()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MP_API.SNIA|Plugin Properties|exposesPathDeviceFiles\"]'"
	 * @generated
	 */
	Boolean getExposesPathDeviceFiles();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getExposesPathDeviceFiles <em>Exposes Path Device Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposes Path Device Files</em>' attribute.
	 * @see #getExposesPathDeviceFiles()
	 * @generated
	 */
	void setExposesPathDeviceFiles(Boolean value);

	/**
	 * Returns the value of the '<em><b>Device Name Filespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string representing the primary file names the driver uses for multipath logical units, if those filenames do not match the names in Logical Unit osDeviceName as documented in Appendix A of the SNIA MP API specification. The name is expressing in the following format: 
	 * '*' represents one or more alphanumeric characters 
	 * '#' represents a string of consecutive digits 
	 * '%' represents a string of hexadecimal digits 
	 * backslash is an escape character for literal presentation of *, #, or %. Any other character is interpreted literally. For example, '/dev/vx/dmp/*'. If the multipath driver creates multipath logical unit device file names in the same namespace as the OS then this property should be left null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Name Filespace</em>' attribute.
	 * @see #setDeviceNameFilespace(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathConfigurationCapabilities_DeviceNameFilespace()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256' MappingStrings='[\"MP_API.SNIA|MP_PLUGIN_PROPERTIES|deviceNameFilespace\"]'"
	 * @generated
	 */
	String getDeviceNameFilespace();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getDeviceNameFilespace <em>Device Name Filespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Name Filespace</em>' attribute.
	 * @see #getDeviceNameFilespace()
	 * @generated
	 */
	void setDeviceNameFilespace(String value);

	/**
	 * Returns the value of the '<em><b>Only Supports Specified Products</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the only supported device types are those described in aggregated CIM_Product instances as described in the description of SupportedLoadBalanceTypes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Only Supports Specified Products</em>' attribute.
	 * @see #setOnlySupportsSpecifiedProducts(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathConfigurationCapabilities_OnlySupportsSpecifiedProducts()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MP_API.SNIA|MP_PLUGIN_PROPERTIES|deviceNameFilespace\"]' ModelCorrespondence='[\"CIM_SCSIMultipathConfigurationCapabilities.SupportedLoadBalanceTypes\"]'"
	 * @generated
	 */
	Boolean getOnlySupportsSpecifiedProducts();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getOnlySupportsSpecifiedProducts <em>Only Supports Specified Products</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only Supports Specified Products</em>' attribute.
	 * @see #getOnlySupportsSpecifiedProducts()
	 * @generated
	 */
	void setOnlySupportsSpecifiedProducts(Boolean value);

	/**
	 * Returns the value of the '<em><b>Maximum Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the range of administer settable path weights supported by the driver. A driver with no path preference capabilities should set this property to zero. A driver with the ability to enable/disable paths should set this property to 1. Drivers with more weight settings can set the property appropriately.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Weight</em>' attribute.
	 * @see #setMaximumWeight(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathConfigurationCapabilities_MaximumWeight()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MP_API.SNIA|MP_PLUGIN_PROPERTIES|maximumWeight\"]'"
	 * @generated
	 */
	Long getMaximumWeight();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getMaximumWeight <em>Maximum Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Weight</em>' attribute.
	 * @see #getMaximumWeight()
	 * @generated
	 */
	void setMaximumWeight(Long value);

	/**
	 * Returns the value of the '<em><b>Autofailback Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the implementation supports auto-failback (to re-enable paths that revert to a good state) at the plugin level, the multipath logical unit level, both levels or whether auto-failback is unsupported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Autofailback Support</em>' attribute.
	 * @see #setAutofailbackSupport(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathConfigurationCapabilities_AutofailbackSupport()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"No Autofailback support\",\"Autofailback support service-wide\",\"Autofailback support per logical unit\",\"Autofailback support per service or logical unit\"]' MappingStrings='[\"MP_API.SNIA|MP_PLUGIN_PROPERTIES|autofailbackSupport\"]' ModelCorrespondence='[\"CIM_SCSIMultipathConfigurationCapabilities.AutofailbackEnabled\",\"CIM_SCSIMultipathSettings.AutofailbackEnabled\"]'"
	 * @generated
	 */
	Integer getAutofailbackSupport();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getAutofailbackSupport <em>Autofailback Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autofailback Support</em>' attribute.
	 * @see #getAutofailbackSupport()
	 * @generated
	 */
	void setAutofailbackSupport(Integer value);

	/**
	 * Returns the value of the '<em><b>Auto Failback Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Boolean indicating that autofailback is enabled to all logical units associated to the CIM_SCSIPathConfigurationService associated with this capabilities instance (unless overridden by CIM_SCSIMultipathSettings AutoFailbackEnabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Failback Enabled</em>' attribute.
	 * @see #setAutoFailbackEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathConfigurationCapabilities_AutoFailbackEnabled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MP_API.SNIA|MP_PLUGIN_PROPERTIES|autoFailbackEnabled\"]' ModelCorrespondence='[\"CIM_SCSIMultipathConfigurationCapabilities.AutofailbackSupport\",\"CIM_SCSIMultipathSettings.AutofailbackEnabled\"]'"
	 * @generated
	 */
	Boolean getAutoFailbackEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getAutoFailbackEnabled <em>Auto Failback Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Failback Enabled</em>' attribute.
	 * @see #getAutoFailbackEnabled()
	 * @generated
	 */
	void setAutoFailbackEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Polling Rate Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum polling rate (in seconds) supported by the driver. A value of zero indicates the driver/plugin does not support polling. This maximum applies to both BadPathPollingRate and InactivePathPollingRate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polling Rate Max</em>' attribute.
	 * @see #setPollingRateMax(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathConfigurationCapabilities_PollingRateMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MP_API.SNIA|MP_PLUGIN_PROPERTIES|pollingRateMax\"]'"
	 * @generated
	 */
	Long getPollingRateMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getPollingRateMax <em>Polling Rate Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polling Rate Max</em>' attribute.
	 * @see #getPollingRateMax()
	 * @generated
	 */
	void setPollingRateMax(Long value);

	/**
	 * Returns the value of the '<em><b>Current Polling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current rate in seconds. Only valid when pollingRateMax is greater than 0 and canAutoFailback are true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Polling Rate</em>' attribute.
	 * @see #setCurrentPollingRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathConfigurationCapabilities_CurrentPollingRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' MappingStrings='[\"MP_API.SNIA|MP_PLUGIN_PROPERTIES|currentPollingRate\"]'"
	 * @generated
	 */
	Long getCurrentPollingRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getCurrentPollingRate <em>Current Polling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Polling Rate</em>' attribute.
	 * @see #getCurrentPollingRate()
	 * @generated
	 */
	void setCurrentPollingRate(Long value);

	/**
	 * Returns the value of the '<em><b>Default Load Balance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The load balance types supported by the driver if not overridden by an administrative action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Load Balance Type</em>' attribute.
	 * @see #setDefaultLoadBalanceType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathConfigurationCapabilities_DefaultLoadBalanceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Unknown\",\"Other\",\"No Load Balancing\",\"Round Robin\",\"Least Blocks\",\"Least IO\",\"Product Specific\"]' MappingStrings='[\"MP_API.SNIA|MP_PLUGIN_PROPERTIES|defaultLoadBalanceType\"]'"
	 * @generated
	 */
	Integer getDefaultLoadBalanceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities#getDefaultLoadBalanceType <em>Default Load Balance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Load Balance Type</em>' attribute.
	 * @see #getDefaultLoadBalanceType()
	 * @generated
	 */
	void setDefaultLoadBalanceType(Integer value);

} // CIM_SCSIMultipathConfigurationCapabilities
