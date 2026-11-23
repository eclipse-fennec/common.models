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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Report Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract parent class for all types of line-oriented reports. Subclasses of this class are generally used by services such as the FSQuotaManagementService, which return an array of report records when asked to issue a report. The Indication qualifier means that instances of this class and its subclasses do not have keys.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ReportRecord()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Indication='true' Abstract='true' Version='2.45.0' UMLPackagePath='CIM::System::Indications'"
 * @generated
 */
@ProviderType
public interface CIM_ReportRecord extends EObject {
} // CIM_ReportRecord
