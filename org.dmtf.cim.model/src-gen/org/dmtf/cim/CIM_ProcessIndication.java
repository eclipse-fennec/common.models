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
 * A representation of the model object '<em><b>CIM Process Indication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract superclass for specialized Indication classes, addressing specific changes and alerts published by providers and instrumentation. Subclasses include AlertIndication (with properties such as PerceivedSeverity and ProbableCause), and SNMPTrapIndication (which recasts Traps as CIM indications).
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProcessIndication()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Indication='true' Abstract='true' Version='2.29.0' UMLPackagePath='CIM::Event'"
 * @generated
 */
@ProviderType
public interface CIM_ProcessIndication extends CIM_Indication {
} // CIM_ProcessIndication
