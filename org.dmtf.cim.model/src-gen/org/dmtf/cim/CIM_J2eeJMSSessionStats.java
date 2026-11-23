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
 * A representation of the model object '<em><b>CIM J2ee JMS Session Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_J2eeJMSSessionStats class defines the performance statistics that are provided by a JMS session.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJMSSessionStats#getDurableSubscriptionCount <em>Durable Subscription Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJMSSessionStats#getExpiredMessageCount <em>Expired Message Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJMSSessionStats#getMessageCount <em>Message Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJMSSessionStats#getMessageWaitTime <em>Message Wait Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJMSSessionStats#getMessageWaitTimeMaxTime <em>Message Wait Time Max Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJMSSessionStats#getMessageWaitTimeMinTime <em>Message Wait Time Min Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJMSSessionStats#getMessageWaitTimeTotalTime <em>Message Wait Time Total Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJMSSessionStats#getPendingMessageCount <em>Pending Message Count</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJMSSessionStats()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServerStats' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeJMSSessionStats extends CIM_J2eeStatistic {
	/**
	 * Returns the value of the '<em><b>Durable Subscription Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of durable subscriptions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Durable Subscription Count</em>' attribute.
	 * @see #setDurableSubscriptionCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJMSSessionStats_DurableSubscriptionCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"JSR77.JCP|JSR77.6.26.1.3 getDurableSubscriptionCount|V1.0\"]'"
	 * @generated
	 */
	Long getDurableSubscriptionCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJMSSessionStats#getDurableSubscriptionCount <em>Durable Subscription Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Durable Subscription Count</em>' attribute.
	 * @see #getDurableSubscriptionCount()
	 * @generated
	 */
	void setDurableSubscriptionCount(Long value);

	/**
	 * Returns the value of the '<em><b>Expired Message Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of expired messages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expired Message Count</em>' attribute.
	 * @see #setExpiredMessageCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJMSSessionStats_ExpiredMessageCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"JSR77.JCP|JSR77.6.26.1.4 getExpiredMessageCount|V1.0\"]'"
	 * @generated
	 */
	Long getExpiredMessageCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJMSSessionStats#getExpiredMessageCount <em>Expired Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expired Message Count</em>' attribute.
	 * @see #getExpiredMessageCount()
	 * @generated
	 */
	void setExpiredMessageCount(Long value);

	/**
	 * Returns the value of the '<em><b>Message Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of messages exchanged.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Count</em>' attribute.
	 * @see #setMessageCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJMSSessionStats_MessageCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"JSR77.JCP|JSR77.6.26.1.5 getMessageCount|V1.0\"]'"
	 * @generated
	 */
	Long getMessageCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJMSSessionStats#getMessageCount <em>Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Count</em>' attribute.
	 * @see #getMessageCount()
	 * @generated
	 */
	void setMessageCount(Long value);

	/**
	 * Returns the value of the '<em><b>Message Wait Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time spent by a message before being delivered. The time is represented as a datetime interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Wait Time</em>' attribute.
	 * @see #setMessageWaitTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJMSSessionStats_MessageWaitTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"JSR77.JCP|JSR77.6.26.1.6 getMessageWaitTime|V1.0\"]'"
	 * @generated
	 */
	String getMessageWaitTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJMSSessionStats#getMessageWaitTime <em>Message Wait Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Wait Time</em>' attribute.
	 * @see #getMessageWaitTime()
	 * @generated
	 */
	void setMessageWaitTime(String value);

	/**
	 * Returns the value of the '<em><b>Message Wait Time Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum amount of time spent by a message before being delivered since the beginning of this measurement. The time is represented as a datetime interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Wait Time Max Time</em>' attribute.
	 * @see #setMessageWaitTimeMaxTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJMSSessionStats_MessageWaitTimeMaxTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"JSR77.JCP|JSR77.6.6.1.2 getMaxTime|V1.0\"]'"
	 * @generated
	 */
	String getMessageWaitTimeMaxTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJMSSessionStats#getMessageWaitTimeMaxTime <em>Message Wait Time Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Wait Time Max Time</em>' attribute.
	 * @see #getMessageWaitTimeMaxTime()
	 * @generated
	 */
	void setMessageWaitTimeMaxTime(String value);

	/**
	 * Returns the value of the '<em><b>Message Wait Time Min Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum amount of time spent by a message before being delivered since the beginning of this measurement. The time is represented as a datetime interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Wait Time Min Time</em>' attribute.
	 * @see #setMessageWaitTimeMinTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJMSSessionStats_MessageWaitTimeMinTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"JSR77.JCP|JSR77.6.6.1.3 getMinTime|V1.0\"]'"
	 * @generated
	 */
	String getMessageWaitTimeMinTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJMSSessionStats#getMessageWaitTimeMinTime <em>Message Wait Time Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Wait Time Min Time</em>' attribute.
	 * @see #getMessageWaitTimeMinTime()
	 * @generated
	 */
	void setMessageWaitTimeMinTime(String value);

	/**
	 * Returns the value of the '<em><b>Message Wait Time Total Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total amount of time spent by a message before being delivered since the beginning of this measurement. Dividing MessageWaitTimeTotalTime by MessageWaitTime will provide the average time spent using a connection. The time is represented as a datetime interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Wait Time Total Time</em>' attribute.
	 * @see #setMessageWaitTimeTotalTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJMSSessionStats_MessageWaitTimeTotalTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"JSR77.JCP|JSR77.6.6.1.4 getTotalTime|V1.0\"]'"
	 * @generated
	 */
	String getMessageWaitTimeTotalTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJMSSessionStats#getMessageWaitTimeTotalTime <em>Message Wait Time Total Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Wait Time Total Time</em>' attribute.
	 * @see #getMessageWaitTimeTotalTime()
	 * @generated
	 */
	void setMessageWaitTimeTotalTime(String value);

	/**
	 * Returns the value of the '<em><b>Pending Message Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of pending messages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pending Message Count</em>' attribute.
	 * @see #setPendingMessageCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJMSSessionStats_PendingMessageCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"JSR77.JCP|JSR77.6.26.1.7 getPendingMessageCount|V1.0\"]'"
	 * @generated
	 */
	Long getPendingMessageCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJMSSessionStats#getPendingMessageCount <em>Pending Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pending Message Count</em>' attribute.
	 * @see #getPendingMessageCount()
	 * @generated
	 */
	void setPendingMessageCount(Long value);

} // CIM_J2eeJMSSessionStats
