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
 * A representation of the model object '<em><b>CIM Watchdog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_Watchdog is a timer that is implemented in the system hardware. It allows the hardware to monitor the state of the Operating System, BIOS, or a software component that is installed on the System. If the monitored component fails to re-arm the timer before its expiration, the hardware assumes that the System is in a critical state, and could reset the ComputerSystem. This feature can also be used as an application watchdog timer for a mission-critical application. In this case, the application would assume responsibility for re-arming the timer before expiration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Watchdog#getMonitoredEntity <em>Monitored Entity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Watchdog#getMonitoredEntityDescription <em>Monitored Entity Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Watchdog#getTimeoutInterval <em>Timeout Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Watchdog#getTimerResolution <em>Timer Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Watchdog#getTimeOfLastExpiration <em>Time Of Last Expiration</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Watchdog#getMonitoredEntityOnLastExpiration <em>Monitored Entity On Last Expiration</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Watchdog#getActionOnExpiration <em>Action On Expiration</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Watchdog()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::Processor' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_Watchdog extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Monitored Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entity that is currently being monitored by the WatchDog. This property is used to identify the module that is responsible for re-arming, or whose information is used to re-arm, the watchdog at periodic intervals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monitored Entity</em>' attribute.
	 * @see #setMonitoredEntity(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Watchdog_MonitoredEntity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Unknown\",\"Other\",\"Operating System\",\"Operating System Boot Process\",\"Operating System Shutdown Process\",\"Firmware Boot Process\",\"BIOS Boot Process\",\"Application\",\"Service Processor\"]'"
	 * @generated
	 */
	Integer getMonitoredEntity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Watchdog#getMonitoredEntity <em>Monitored Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored Entity</em>' attribute.
	 * @see #getMonitoredEntity()
	 * @generated
	 */
	void setMonitoredEntity(Integer value);

	/**
	 * Returns the value of the '<em><b>Monitored Entity Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that describes more textual information about the monitored entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monitored Entity Description</em>' attribute.
	 * @see #setMonitoredEntityDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Watchdog_MonitoredEntityDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getMonitoredEntityDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Watchdog#getMonitoredEntityDescription <em>Monitored Entity Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored Entity Description</em>' attribute.
	 * @see #getMonitoredEntityDescription()
	 * @generated
	 */
	void setMonitoredEntityDescription(String value);

	/**
	 * Returns the value of the '<em><b>Timeout Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timeout interval that is used by the watchdog, in MicroSeconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout Interval</em>' attribute.
	 * @see #setTimeoutInterval(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Watchdog_TimeoutInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='MicroSeconds' PUnit='second * 10^-6'"
	 * @generated
	 */
	Long getTimeoutInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Watchdog#getTimeoutInterval <em>Timeout Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Interval</em>' attribute.
	 * @see #getTimeoutInterval()
	 * @generated
	 */
	void setTimeoutInterval(Long value);

	/**
	 * Returns the value of the '<em><b>Timer Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resolution of the timer. For example, if this value is 100, then the timer can expire anytime between (TimeoutInterval- 100) microseconds or (TimeoutInterval+100) microseconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timer Resolution</em>' attribute.
	 * @see #setTimerResolution(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Watchdog_TimerResolution()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='MicroSeconds' PUnit='second * 10^-6'"
	 * @generated
	 */
	Long getTimerResolution();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Watchdog#getTimerResolution <em>Timer Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer Resolution</em>' attribute.
	 * @see #getTimerResolution()
	 * @generated
	 */
	void setTimerResolution(Long value);

	/**
	 * Returns the value of the '<em><b>Time Of Last Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time of the last timer expiry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Of Last Expiration</em>' attribute.
	 * @see #setTimeOfLastExpiration(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Watchdog_TimeOfLastExpiration()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getTimeOfLastExpiration();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Watchdog#getTimeOfLastExpiration <em>Time Of Last Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of Last Expiration</em>' attribute.
	 * @see #getTimeOfLastExpiration()
	 * @generated
	 */
	void setTimeOfLastExpiration(String value);

	/**
	 * Returns the value of the '<em><b>Monitored Entity On Last Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Monitored entity at the time of last timer expiry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monitored Entity On Last Expiration</em>' attribute.
	 * @see #setMonitoredEntityOnLastExpiration(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Watchdog_MonitoredEntityOnLastExpiration()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Unknown\",\"Other\",\"Operating System\",\"Operating System Boot Process\",\"Operating System Shutdown Process\",\"Firmware Boot Process\",\"BIOS Boot Process\",\"Application\",\"Service Processor\"]'"
	 * @generated
	 */
	Integer getMonitoredEntityOnLastExpiration();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Watchdog#getMonitoredEntityOnLastExpiration <em>Monitored Entity On Last Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored Entity On Last Expiration</em>' attribute.
	 * @see #getMonitoredEntityOnLastExpiration()
	 * @generated
	 */
	void setMonitoredEntityOnLastExpiration(Integer value);

	/**
	 * Returns the value of the '<em><b>Action On Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The action that should happen upon the expiry of the watchdog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action On Expiration</em>' attribute.
	 * @see #setActionOnExpiration(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Watchdog_ActionOnExpiration()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"None - Status Only\",\"System Reset\",\"System Power Off\",\"System Power Off, then On\",\"Generate System NonMaskableInterrupt (NMI)\",\"Generate System Management Interrupt (SMI)\"]'"
	 * @generated
	 */
	Integer getActionOnExpiration();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Watchdog#getActionOnExpiration <em>Action On Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action On Expiration</em>' attribute.
	 * @see #getActionOnExpiration()
	 * @generated
	 */
	void setActionOnExpiration(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A method to re-arm the timer. This method is used only if the MonitoredEntity is "Application". It returns 0 if successful, 1 if unsupported, and any other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' can also be specified in the subclass as a Values array qualifier.
	 * <!-- end-model-doc -->
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long KeepAlive();

} // CIM_Watchdog
